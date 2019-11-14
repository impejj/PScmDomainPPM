package com.profesys.scientiam.pm.work

import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class TimeEntry {

	String id
	Timesheet timesheet
	String description
	WorkEffort workEffort
	Party party
	WorkEffortType workEffortAction
	Date fromDate
	Date thruDate
	Double minutes
	String comments
	 
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted

	static mapping = {
		id column: "time_entry_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		fromDate nullable: true
		thruDate nullable: true
		minutes nullable: true
		comments nullable: true
		timesheet nullable: true
		
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
