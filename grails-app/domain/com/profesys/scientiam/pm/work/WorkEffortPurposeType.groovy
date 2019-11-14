package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

class WorkEffortPurposeType {

	String id
	String description
	 
	WorkEffortPurposeType parentType
 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	 
	static mapping = {
		id column: "work_effort_purpose_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		   state(nullable: true , display:false )
		parentType nullable: true , display:true
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${description}"
		}
}
