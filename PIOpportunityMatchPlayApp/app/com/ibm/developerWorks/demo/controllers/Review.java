/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.controllers;

import java.util.List;

import com.ibm.developerWorks.demo.models.JobApplication;


import play.cache.Cache;
import play.mvc.Controller;
import play.mvc.Result;
import com.ibm.developerWorks.demo.views.html.applicationlist;

public class Review extends Controller {
	
	
	public static Result showApplications(){
		List<JobApplication> allApplications = JobApplication.findAllJobApplications();
	    return ok(applicationlist.render(allApplications));
	}
	
	
	public static Result downloadResume(Long textSampleId){
		System.out.println("Recieved download call for id: " + textSampleId);
		
		
		JobApplication theTextSample = JobApplication.find.byId(textSampleId);
		
		System.out.println("Retrieved text sample for name: " + theTextSample.firstname);
		System.out.println("theTextSample.resumefile: " + theTextSample.resumefile);
		response().setContentType("application/x-download");  
		response().setHeader("Content-disposition","attachment; filename=" + theTextSample.resumefilename);  
		return ok(theTextSample.resumefile);
		
	}
	
	
	
	
}