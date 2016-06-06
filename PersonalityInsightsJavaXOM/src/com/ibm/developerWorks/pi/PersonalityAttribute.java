/** 
 * Copyright (C) 2016 IBM Corporation
 */
package com.ibm.developerWorks.pi;

import java.math.BigDecimal;
import java.util.Vector;

/**
 * 
 * Models a child element in the JSON object tree returned by the Watson Personality Insight Service
 *
 */
public class PersonalityAttribute {
	public String id;
	public String name;
	public BigDecimal percentage;
	public Vector<PersonalityAttribute> children;
	public BigDecimal sampling_error;
	public String category;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
	public Vector<PersonalityAttribute> getChildren() {
		return children;
	}
	public void setChildren(Vector<PersonalityAttribute> children) {
		this.children = children;
	}
	public BigDecimal getSampling_error() {
		return sampling_error;
	}
	public void setSampling_error(BigDecimal sampling_error) {
		this.sampling_error = sampling_error;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;

	}
}
