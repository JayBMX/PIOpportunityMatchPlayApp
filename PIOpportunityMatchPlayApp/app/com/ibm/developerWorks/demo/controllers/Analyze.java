/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.common.io.Files;
import com.ibm.developerWorks.demo.json.GetPersonalityInsightsResultJson;
import com.ibm.developerWorks.demo.json.GetRulesResultJson;
import com.ibm.developerWorks.demo.models.JobApplication;

import play.cache.Cache;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import com.ibm.developerWorks.demo.views.html.analyzepage;
import com.ibm.developerWorks.demo.views.html.analyzeresultspage;

public class Analyze extends Controller {
	
	public static final Form<JobApplication> jobApplicationForm = Form.form(JobApplication.class);
	
	public static Result showLandingPage(){
		return ok(analyzepage.render(jobApplicationForm));
	
	}
	
	public static Result analyzeText(){
		Form<JobApplication> boundForm = jobApplicationForm.bindFromRequest();
		if (boundForm.hasErrors()){
			flash("error", "Please correct the form below."); //store a message in the flash scope
			return badRequest(analyzepage.render(boundForm));
		}
		
		JobApplication jobApplication = boundForm.get();
		MultipartFormData body = request().body().asMultipartFormData();
		MultipartFormData.FilePart part = body.getFile("resumefile");
		String fileName = part.getFilename();
		jobApplication.resumefilename = fileName;
		
		if (part != null){
			File resumeFile = part.getFile();
			try {
				jobApplication.resumefile = Files.toByteArray(resumeFile);
				
			} catch (IOException ioex){
				return internalServerError("Error reading file upload");
			} catch (Exception ex){
				return internalServerError("Error occured when processing the uploaded file");
			}
		}
		
		
		
		String dataForPIAnalysis = jobApplication.text + jobApplication.text2 + jobApplication.text3;

		GetPersonalityInsightsResultJson requestToPI = new GetPersonalityInsightsResultJson(dataForPIAnalysis);
		requestToPI.completeOperationAndReturnResult();
		
		jobApplication.save();
		flash("success", "jobApplication added succesfully"); //store a message into the flash scope
		
		GetRulesResultJson requestToRules = new GetRulesResultJson(jobApplication.id, requestToPI.theResponsePI);
		requestToRules.completeOperationAndReturnResult();
		
		//store result into session
		session().clear();
		String uuid= java.util.UUID.randomUUID().toString();
		Cache.set(uuid, jobApplication.firstname);
		
	    //store uuid in session for extracting the proper result analysis from cache later
        session("uuid",uuid); 
		

		return redirect(routes.Analyze.showResults());		
	}
	
	public static Result showResults(){
	    String uuid = session("uuid");
	    String name = (String)Cache.get(uuid);	    
	    return ok(analyzeresultspage.render(name));
	}
	
	
}
