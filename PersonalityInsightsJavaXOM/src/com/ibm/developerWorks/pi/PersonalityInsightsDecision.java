/** 
 * Copyright (C) 2016 IBM Corporation
 */
package com.ibm.developerWorks.pi;

import java.math.BigDecimal;
import java.util.Vector;

/**
 * 
 * @author Administrator
 *
 */
public class PersonalityInsightsDecision {

	public static enum FLAG {EXCCEDS, SATISFIES, FAILS, UNDETERMINED};
	
	public FLAG statusFlag;
	public BigDecimal score;
	private Vector<PersonalityAttribute> personalityAttributes = null;
	
	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public Vector<PersonalityAttribute> getPersonalityAttributes() {
		return personalityAttributes;
	}

	public FLAG getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(FLAG statusFlag) {
		this.statusFlag = statusFlag;
	}
	
	public void addPersonalityAttribute(PersonalityAttribute personalityAttribute) {
		if (personalityAttributes == null) {
			new Vector<PersonalityAttribute>();
		}
		personalityAttributes.add(personalityAttribute);
	}
	
	public void addPersonalityAttribute(Vector<PersonalityAttribute> personalityAttribute) {
		if (personalityAttributes == null) {
			personalityAttributes = new Vector<PersonalityAttribute>();
		}
		for (int i = 0; i < personalityAttribute.size(); i++) {
		    personalityAttributes.add(personalityAttribute.get(i));
		}
	}
}
