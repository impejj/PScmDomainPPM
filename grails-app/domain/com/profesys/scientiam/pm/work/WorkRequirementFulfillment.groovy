package com.profesys.scientiam.pm.work

import java.util.Date;

import com.profesys.scientiam.pm.requirement.Requirement
import com.profesys.scientiam.security.User;

 
class WorkRequirementFulfillment   {

 String id
	 
	WorkReqFulfType workReqFulfType
	WorkEffort workEffort
    Requirement requirement

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [Requirement, WorkEffort, WorkReqFulfType]
	static mapping = {
		id   generator: "assigned"
		version true
	}

	static constraints = {
 	    requirement maxSize: 36
		workEffort maxSize: 36
		state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${id} "
		}
}
