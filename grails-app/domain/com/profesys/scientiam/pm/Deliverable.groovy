package com.profesys.scientiam.pm

import com.profesys.scientiam.pm.work.WorkEffort

import java.util.Date;

import com.profesys.scientiam.security.User;

class Deliverable {

	String id
	String code
	String description
 
	DeliverableType deliverableType
	WorkEffort workEffort
	String        ticket
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id  column: "deliverable_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		code nullable: true, maxSize: 100
		description nullable: true
		deliverableType nullable: false , display:false

		ticket nullable: true
 		     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
