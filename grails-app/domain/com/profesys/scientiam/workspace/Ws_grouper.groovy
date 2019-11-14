package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_grouper {

 	String           description    //
	Ws_grouperType    grouperType
	String             detail
	
	Date	         fromDate
	Date              dueDate
	 
 	Boolean       statusClosed
	
	 
	
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
		     grouperType(nullable: true   , display:true  )
	   fromDate(nullable: false  , display:true  )
	     dueDate(nullable: true   , display:true  )
	     statusClosed(nullable: false  , display:true  )
		   
				
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
