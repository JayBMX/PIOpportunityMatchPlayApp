/* Copyright (C) 2016 IBM Corporation
 *
 */

package com.ibm.developerWorks.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import play.data.format.Formats.NonEmpty;
import play.data.validation.Constraints.MinLength;
import play.data.validation.Constraints.Pattern;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class JobApplication extends Model {

	public static Finder<Long, JobApplication> find = new Finder<Long, JobApplication>(Long.class, JobApplication.class);
	
	@Id
	public Long id;
	
	@Required
	@NonEmpty
	public String firstname;
	
	@Required
	@NonEmpty
	public String lastname;
	
	@Required
	@NonEmpty
	public String addressline1;
	@Required
	@NonEmpty
	public String addressline2;
	@Required
	@NonEmpty
	public String city;
	@Required
	@NonEmpty
	public String province;
	@Required
	@NonEmpty
	public String postalcode;
	@Required
	@NonEmpty
	public String country;
	
	@Lob
	public byte[] resumefile;
	
	@Column(columnDefinition = "TEXT")
	public String resumefilecontent;
	
	@Column(columnDefinition = "TEXT")
	public String resumefilename;
	
	@Required
	@NonEmpty
	@MinLength(300)
	@Column(columnDefinition = "TEXT")
	public String text;
	
	@Required
	@NonEmpty
	@MinLength(300)
	@Column(columnDefinition = "TEXT")
	public String text2;
	
	@Required
	@NonEmpty
	@MinLength(300)
	@Column(columnDefinition = "TEXT")
	public String text3;	

	@Column(columnDefinition = "TEXT")
	public String rulerecommendation;
	
	public JobApplication(){
		
	}
	
	public static List<JobApplication> findAllJobApplications(){
		return find.where().findList();
	}
	
	public void saveJobApplication(){
		this.save();
	}
	
}
