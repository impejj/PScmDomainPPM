package com.profesys.scientiam.workspace

	import java.util.Date;
import com.profesys.scientiam.resource.Reference

import com.profesys.scientiam.security.User;

class Ws_issue {
	String          id
 	String          description    //
	Ws_issueType    issueType
	String          detail
	Integer         urgency     // Cuan urgente debe resolverse
	Integer         priority     // Cuan importante es el registro
	Integer         complexity     // Cuan complejo es resolver este issue
	Integer         advanceLevel     // % de Avance del issue
	Date	        programmedDate
	Date            realizedDate
 	Boolean         statusClosed
	com.profesys.scientiam.resource.Reference 		reference

	String          ticket
	 
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
	 
		   description(nullable: false  , display:true  )
		        detail(nullable: true   , display:true, size:0..65535   )
		     issueType(nullable: true   , display:true  )
		       urgency(nullable: false  , display:true, range:1..10   ) 
		      priority(nullable: false  , display:true, range:1..10   ) 
		    complexity(nullable: false  , display:true, range:1..10   )
		  advanceLevel(nullable: true   , display:true  )
	   programmedDate(nullable: false  , display:true  )
	     realizedDate(nullable: true   , display:true  )
	     statusClosed(nullable: false  , display:true  )
		       ticket(nullable: true   , display:false   )
	reference nullable: true , display:false

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
		detail type: "text"
	}

	String toString(){
		return " ${description}"
		}
	
 
}
