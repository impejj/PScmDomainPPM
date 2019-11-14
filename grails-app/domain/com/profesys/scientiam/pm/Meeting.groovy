package com.profesys.scientiam.pm

import com.profesys.scientiam.pm.work.WorkEffort
import com.profesys.scientiam.pm.work.WorkEffortEstimationType
import com.profesys.scientiam.security.User

class Meeting {
	
	/*
	 * Datos de la reunion
	 */
	
	 String          id
	 String         detail
	MeetingType     meetingType
	 WorkEffort     workEffort 
	
	//Seguridad & Auditoria
	 
	Integer         state   // 0-Borrado 1-ok  2-modificado
	User  	        userCreated
	User  	        userUpdated
	Date            dateCreated  //Date  fechaalta
	Date            lastUpdated  //Date  fechaactualizacion
	Date            dateDeleted
	
	
	static mapping = {
		id   generator: "assigned"
		version true
		detail type: "text"
		
	}
	static constraints = {
			 id  nullable: false , display:true  ,maxSize: 36
		            detail nullable: true , display:true
 			 meetingType nullable: true , display:true
			    workEffort  nullable: true , display:false
			 

		 //Seguridad & Auditoria
		     state nullable: true , display:false  
		  userCreated nullable: true , display:false  
		    userUpdated nullable: true , display:false  
		  dateCreated nullable: true , display:false  
		  lastUpdated nullable: true , display:false    //Date  fechaactualizacion
		  dateDeleted nullable: true , display:false  
		  
		  
		  
	}

	String toString () {
		return   (workEffort != null) ? workEffort : ''
		
		//return ""
		}

}
