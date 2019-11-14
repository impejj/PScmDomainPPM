package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_software {
	
		/*
		 * En este dominio anotaremos todos los software, plugin, extensiones 
		 * que debemos mantener, implementar o crear laboratorios
		 */

 	String      description    //
	String           detail
	Integer         urgency     // Cuan urgente debe resolverse
	Integer           level     // Cuan importante es el registro
	Date		   fromDate
	Date		   untilDate
	Date       realizedDate
	Boolean       completed
	
	 
	
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
		   urgency(nullable: false , display:true, range:1..10   ) 
		   level (nullable: false , display:true, range:1..3   ) 
		   fromDate (nullable: false , display:true  )
		   untilDate (nullable: false , display:true  )
		   realizedDate (nullable: true , display:true  )
		   completed (nullable: false , display:true  )
		   
				
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
