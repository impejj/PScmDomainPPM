package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_book {

 	String             description    //
	Ws_bookSubject         subject    //Administracion, Salud 
	Ws_bookType           bookType    //Revista, libro Amazon, 
	String                  detail
	Integer           calification     // Calificación de la publicacion
	Integer           advanceLevel     // % de Avance de lectura
	Date	            boughtDate
	Date        estimatedStartDate
	Date   estimatedCompletionDate
	Date           actualStartDate
	Date      actualCompletionDate
 	Boolean           statusClosed
	String                  author
	String                  ticket
	 
	
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
		       subject(nullable: true   , display:true  )
		  calification(nullable: true  , display:true, range:1..10   )
		  advanceLevel(nullable: true   , display:true  )
	        boughtDate(nullable: false  , display:true  )
	      estimatedStartDate(nullable: true   , display:true  )
		    estimatedCompletionDate(nullable: true   , display:true  )
			actualStartDate(nullable: true   , display:true  )
			actualCompletionDate(nullable: true   , display:true  )
	      statusClosed(nullable: false  , display:true  )
		        author(nullable: true   , display:true)
				
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
