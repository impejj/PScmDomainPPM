package com.profesys.scientiam.pm

import java.util.Date;


import com.profesys.scientiam.security.User;

class IterationType {
	
	/*
	 * Tipos de iteracion ( por ejemplo sprint para proyectos scrum ) 
	 */
	
	 String          id
	 String         description 
	 String         detail

	 
	
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
			 

		            detail nullable: true , display:true    
				description nullable: true , display:true     
			 
		 
		 //Seguridad & Auditoria
		     state nullable: true , display:false  
		  userCreated nullable: true , display:false  
		    userUpdated nullable: true , display:false  
		  dateCreated nullable: true , display:false  
		  lastUpdated nullable: true , display:false    //Date  fechaactualizacion
		  dateDeleted nullable: true , display:false  
		  
		  
		  
	}

	String toString () {
		return "${description}"
		//return ""
		}
	
 
	
	
}
