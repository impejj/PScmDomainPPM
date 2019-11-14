package com.profesys.scientiam.pm.issue

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.security.User;

class IssueType {
	
	/*Definir el tipo de incidente con el que debemos lidiar*/
	/*
	  
	 Bug-Incidente
    Improvement
    New Feature
    Task
    Wish List
    Must to Have List
    Request
    Change
    Project
    Documentation*/

    String                 id
	String		         code
	String        description
    String			   detail
	String             fontImage
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		id 			 maxSize: 36,nullable: false  , display:true
		
				   code(nullable: true , display:true )
	        description(nullable: true , display:true )
			fontImage nullable: true , display:true 
			     detail(nullable: true , display:true  ,  size:0..65535  )
				 
				 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {
		id   generator: "assigned"
		version true
	   detail type: 'text'
	}
	String toString(){
		return "${description}"
		}
}
