package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User
 

class WorkEffortSurveyAppl  {

 
	String surveyId
	Date fromDate
	Date thruDate
	 
	WorkEffort workEffort
	
//	Survey survey
//	ProductStoreSurveyAppl productStoreSurveyAppl
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [ProductStoreSurveyAppl, Survey, WorkEffort]

	 
	static constraints = {
		workEffort maxSize: 36
		surveyId maxSize: 36
		thruDate nullable: true
		  state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${id}- ${description}"
		}
}
