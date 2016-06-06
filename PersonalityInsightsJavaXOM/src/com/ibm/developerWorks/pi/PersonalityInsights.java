/** 
 * Copyright (C) 2016 IBM Corporation
 */
package com.ibm.developerWorks.pi;

/**
 * 
 * Models the JSON object returned by the Watson Personality Insight Service
 *
 */
public class PersonalityInsights {

	// ------------------------------------------------------------------------
	//
	// ------------------------------------------------------------------------
	public PersonalityAttribute tree;
	public String id;
	public String source;
	public int word_count;
	public String word_count_message;
	public String processed_lang;

	public PersonalityAttribute getTree() {
		return tree;
	}

	public void setTree(PersonalityAttribute tree) {
		this.tree = tree;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getWord_count() {
		return word_count;
	}

	public void setWord_count(int word_count) {
		this.word_count = word_count;
	}

	public String getWord_count_message() {
		return word_count_message;
	}

	public void setWord_count_message(String word_count_message) {
		this.word_count_message = word_count_message;
	}

	public String getProcessed_lang() {
		return processed_lang;
	}

	public void setProcessed_lang(String processed_lang) {
		this.processed_lang = processed_lang;
	}

}
