/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json;

import java.util.concurrent.TimeUnit;

import play.libs.Json;
import play.libs.WS;
import play.libs.WS.Response;
import play.libs.WS.WSRequestHolder;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ibm.developerWorks.demo.json.response.ResponsePI;
import com.ibm.developerWorks.demo.models.JobApplication;

public class GetRulesResultJson {

	public static String personalityInsightsURL = "https://<yourServiceId>.ng.bluemix.net/DecisionService/rest/HiringPIRuleApp/1.0/HiringPIRules/1.0";

	public static String username = "";
	public static String password = "";
	
	
	public JsonNode theRequestRulesJSON;
	public ObjectNode theCompleteRulesRequest;
	
	
	public Long textSampleId;
	public String ruleRecommendation;
	
	public String theResponseRules;
	
	public GetRulesResultJson(Long textSampleId, ResponsePI responseFromPI){
		this.textSampleId = textSampleId;
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT); //pretty print it
		JsonNode node = mapper.convertValue(responseFromPI, JsonNode.class);
		this.theRequestRulesJSON = node;
		
		JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
		ObjectNode parentNode = nodeFactory.objectNode();
		parentNode.put("PersonalityInsights", this.theRequestRulesJSON);
		parentNode.put("category", "Test");
		
		this.theCompleteRulesRequest = parentNode;

			   
	}
	
	public GetRulesResultJson completeOperationAndReturnResult(){
		
		JsonNode resultJSON = fetchInformation();
		if (resultJSON == null){
			return null; //empty response
		} else {
			return this; //already assigned and saved, so just return this one
		}
	}
	
	
	
	private JsonNode fetchInformation(){
	    String restServiceUrl = personalityInsightsURL;
	    WSRequestHolder requestHolder = WS.url(restServiceUrl);
	    
	    requestHolder.setAuth(username, password);
	    
	    requestHolder.setContentType("application/json");	   
	    Future<Response> future = requestHolder.post(this.theCompleteRulesRequest).wrapped();
	    try {
	        Response result = Await.result(future, Duration.apply(30, TimeUnit.SECONDS));
	        JsonNode jsonNode = Json.parse(result.asJson().toString());
	        this.ruleRecommendation = jsonNode.get("decision").get("statusFlag").asText();
	        
	        JobApplication theJobApplication = JobApplication.find.byId(this.textSampleId);
	        theJobApplication.rulerecommendation = this.ruleRecommendation;
	        theJobApplication.save();
	        
	        return jsonNode;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	 
	}
	
}
