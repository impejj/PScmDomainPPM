package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

class WorkEffortIcalData   {

 
    String           id 
	String      icalData
    //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	
	static mapping = {
		id   generator: "assigned"
		version true
	}
	static constraints = {
		     
		   icalData nullable: true
		   state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	 
	
}
