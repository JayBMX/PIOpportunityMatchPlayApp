This README file describes application provided with the DeveloperWorks article
"Integrate Business Rules with Watson services on IBM Bluemix", Part 1 and Part 2,
its structure and how it can be used.

For license information, see license.txt file in the root directory of this project.



1. Introduction
	This git repository contains all the code you need to build, deploy and run the application created
	"Integrate Business Rules with Watson services on IBM Bluemix", Part 1 and Part 2. The purpose of the article
	and accompanying application is to demonstrate how you can use the Business Rules service to automate
	decisions based on the results of the Watson Personality Insights service. Furthermore, you will
	learn how to create a simple example of an opportunity matching web application with Play Framework 2 and then
	deploy it on Bluemix.

	As you go through each section of the DeveloperWorks article, the code will serve as a reference and 
	demonstrate the end result of development work. 


	
2. Application Structure
	The application is divided into several projects:
	a) PersonalityInsightsJavaXOM
		This project contains Java Execution Object Model (XOM) files that resembles the personality insights JSON data model.
		The files from this project are verbalized and used as the Business Object Model (BOM) for the PIOpportunityMatchRules project.
		
		
	b) PIOpportunityMatchPlayApp
		This project contains the Play Framework 2 application that provides a front end for the users to enter their data and
		serves as an integration piece between Personality Insights Service and the PIOpportunityMatchRules project which handles
		calls to the Rule Service. 		
		
		
	c) PIOpportunityMatchRuleApp
		This project is a compiled ruleapp generated from PIOpportunityMatchRules project, it contains jars that can be deployed and
		executed on a Operational Decision Server ruleserver or service.
	
	
	d) PIOpportunityMatchRules
		This is a rule project, it contains a ruleflow, rules and the Business Object Model (BOM) that allows them to operate. The
		rules take in personality insights attributes and return a recommendation based on these attributes. The BOM
		is created from verbalized files in PersonalityInsightsJavaXOM, and this project itself is compiled into an executable ruleapp, 
		PIOpportunityMatchRuleApp.
		
		
	e) sample-personality-insights-result.json - a sample input files to test the PIOpportunityMatchRuleApp
	
	
	f) sample-pi-business-rules-result.json - a sample output file from PIOpportunityMatchRuleApp
	


3. Usage Instructions
	After deploying the Personality Insights business rules project (PIOpportunityMatchRuleApp), 
	and the play framework 2 project (PIOpportunityMatchPlayApp), using the instruction from the
	accompanying article, submit your own data to see the rule recommendation.
	
	In order to do that, navigate to the deployed application, http://<deployedName>.mybluemix.net,
	and fill out all of the fields on the form. Click Submit and you will be redirected to a thank you screen.
	
	At this point you can navigate to http://<deployedName>.mybluemix.net/review and see the Rule
	Recommendation for your submission from the perspective of the reviewer.
	
	
	
	




