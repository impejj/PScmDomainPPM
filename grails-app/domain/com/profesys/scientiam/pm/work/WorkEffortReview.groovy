package com.profesys.scientiam.pm.work

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User

 

class WorkEffortReview   {

 
 
	Date reviewDate
	Character postedAnonymous
	Double rating
	String reviewText
 
	WorkEffort workEffort
	StatusItem statusItem
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 

	static belongsTo = [StatusItem,   WorkEffort]

 
	static constraints = {
		workEffort maxSize: 36
 
		postedAnonymous nullable: true, maxSize: 1
		rating nullable: true
		reviewText nullable: true
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
