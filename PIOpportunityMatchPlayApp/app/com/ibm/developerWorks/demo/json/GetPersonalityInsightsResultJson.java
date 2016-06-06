/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.json;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import play.libs.Json;
import play.libs.WS;
import play.libs.WS.Response;
import play.libs.WS.WSRequestHolder;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.developerWorks.demo.json.request.ContentItem;
import com.ibm.developerWorks.demo.json.request.RequestPI;
import com.ibm.developerWorks.demo.json.response.ResponsePI;

public class GetPersonalityInsightsResultJson {
	
	//for testing purposes, these should be your own endpoint URI and credentials
	public static String personalityInsightsURL = "https://gateway.watsonplatform.net/personality-insights/api/v2/profile";
	public static String username = "";
	public static String password = "";
	
	public RequestPI theRequestPI;
	public ResponsePI theResponsePI;
	
	public GetPersonalityInsightsResultJson(String textToAnalyze){
		this.theRequestPI = new RequestPI();
		ContentItem theContentItem = new ContentItem();
		theContentItem.setContenttype("text/plain");
		theContentItem.setContent(textToAnalyze);
		List<ContentItem> listOfContentItems = new ArrayList<ContentItem>();
		listOfContentItems.add(theContentItem);				
		this.theRequestPI.setContentItems(listOfContentItems);
	}
	
	public GetPersonalityInsightsResultJson completeOperationAndReturnResult(){
		
		JsonNode resultJSON = fetchInformation();
		if (resultJSON == null){
			//Couldn't get the data, service is down, return null
			return null;
		} else {			
			try {
				ObjectMapper mapper = new ObjectMapper();
				ResponsePI theResponse = mapper.treeToValue(resultJSON, ResponsePI.class);
				this.theResponsePI = theResponse;
			} catch (NullPointerException npex){
				//One of the expected JSON properties was not present in response
				npex.printStackTrace();
					
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}	
		return this;
		}
	}
	
	private JsonNode fetchInformation(){
	    String restServiceUrl = personalityInsightsURL;
	    
	    WSRequestHolder requestHolder = WS.url(restServiceUrl);
	    requestHolder.setAuth(username, password);
	    
	    ObjectMapper mapper = new ObjectMapper(); 
	    JsonNode postContent = mapper.valueToTree(this.theRequestPI);
	    
	    
	    Future<Response> future = requestHolder.post(postContent).wrapped();
	    try {
	        Response result = Await.result(future, Duration.apply(30, TimeUnit.SECONDS));
	        JsonNode jsonNode = Json.parse(result.asJson().toString());
	        
	        System.out.println("EVG: result.asJson().toString():");
	        System.out.println(result.asJson().toString());
	        
	        return jsonNode;
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return null;
	 
	}
	
	
	
}

