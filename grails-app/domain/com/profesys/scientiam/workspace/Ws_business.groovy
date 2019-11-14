package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_business {

	Ws_businessType businessType
	String         description    //
	String              detail
	Date             valueDate    //Fecha de la lista
	String              ticket
		
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
	      businessType(nullable: true  , display:true  )
		   description(nullable: true  , display:true  )
	         valueDate(nullable: true  , display:true  )
	  		    detail(nullable: true  , display:true, size:0..65535   )
			    ticket(nullable: true  , display:false  )
				  
				  
			  
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
