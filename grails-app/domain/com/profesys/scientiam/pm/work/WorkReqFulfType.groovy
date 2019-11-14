package com.profesys.scientiam.pm.work


import com.profesys.scientiam.security.User

class WorkReqFulfType {

	String id
	String description
 
 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static hasMany = [workRequirementFulfillments: WorkRequirementFulfillment]

	static mapping = {
		id column: "work_req_fulf_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
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
