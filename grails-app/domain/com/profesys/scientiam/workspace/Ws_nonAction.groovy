package com.profesys.scientiam.workspace

import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_nonAction {
	

 	String          description     //
	Ws_nonActionType    nonActionType     /*Tipos de acciones - ASAP (HACER LO antes posible ) 
	 								                  Una fecha determinada
	 								 */ 
	Integer             idOrigen     //id dentro del modulo origen
	Ws_issueType       issueType       //Para los casos en que venta por tipo de Issue
	String                detail
	Integer              urgency     // Cuan urgente debe resolverse
	Integer             priority     // Cuan importante/grave es el registro
	Integer           complexity     // Cuan complejo es resolver este issue
	Integer         advanceLevel     // % de Avance del issue
	Date	  programmedDateFrom
	Date	    programmedDateTo
	Date            realizedDate
 	Boolean         statusClosed
	String           delegatedTo
	Date            followUpDate    //Fecha de seguimiento para las acciones delegadas
	Date                 dueDate	//Fecha de vencimiento para las acciones delegadas
	Integer            nonActive	//Acciones no activas ( durmientes ) que pertenecen a algun plan 
									// y se van a activar en algun momento 
	 String               ticket
	 
	 
	
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
		    nonActionType(nullable: true   , display:true  )
		       urgency(nullable: false  , display:true, range:1..10   ) 
		       priority(nullable: false  , display:true, range:1..10   ) 
		    complexity(nullable: false  , display:true, range:1..10   )
		  advanceLevel(nullable: true   , display:true  )
    programmedDateFrom(nullable: false  , display:true  )
	  programmedDateTo(nullable: false  , display:true  )
	      realizedDate(nullable: true   , display:true  )
	      statusClosed(nullable: false  , display:true  )
	   	   delegatedTo(nullable: true   , display:true  )
			 issueType(nullable: true   , display:true  )
			  idOrigen(nullable: true   , display:true  )
	    		ticket(nullable: true   , display:true  )
			   dueDate(nullable: true   , display:true  )
		  followUpDate(nullable: true   , display:true  )
		  	 nonActive(nullable: true   , display:true  )
				ticket(nullable: true   , display:true  )
				
	   
		 
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}

static mapping = {
	detail type: "text"
}

	String toString(){
		return "${id}- ${description}"
		}
	
 
}
