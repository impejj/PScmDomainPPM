package com.profesys.scientiam.pm.work

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class Timesheet {

	String id
	Date fromDate
	Date thruDate
	String description
	
	
	 
 
	StatusItem statusItem
	Party party

	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted

	static mapping = {
		id column: "timesheet_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		fromDate nullable: true
		thruDate nullable: true
		description nullable: true
		 
		state nullable: true , display:false
		userCreated nullable: true , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	 }
	
	
	 String toString(){
		 return "${description}"
		 }
	 
}
