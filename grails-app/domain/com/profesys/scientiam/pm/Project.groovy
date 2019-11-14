package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.pm.work.WorkEffort
import com.profesys.scientiam.pm.work.WorkEffortEstimationType;
import com.profesys.scientiam.security.User;

class Project {
	
	/*
	 * Datos del proyecto a administrar
	 */
	
	 String          id
	 String         detail
	 ProjectType	projectType
	 WorkEffortEstimationType estimationType
	 
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
			   projectType nullable: false , display:true  
		            detail nullable: true , display:true    
//			 parentProject nullable: true , display:true    
			    workEffort  nullable: true , display:false
			 
			 estimationType nullable: true , display:false  

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
	
	String getPrefix () {
		//return "${workEffort.prefix}"
		//return ""
		return (workEffort != null) ? workEffort.prefix : ''
		}
	
	String getFontImage () {
		return (projectType != null) ? projectType.fontImage : ''
		//return ""
		}
}
