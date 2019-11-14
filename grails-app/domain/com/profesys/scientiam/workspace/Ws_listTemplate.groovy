package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_listTemplate {

	
	 
	String      description    //
	String          detail
	Date           dateList    //Fecha de la lista
	String          ticket
	Ws_listType     listType
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	static mapping = {
		detail type: 'text'
	 }
static constraints = {
		   description(nullable: true  , display:true  )
		      dateList(nullable: true  , display:true  )
			  detail(nullable: true  , display:true   )
			  listType(nullable: true  , display:true  )
			  ticket(nullable: true , display:false )
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
