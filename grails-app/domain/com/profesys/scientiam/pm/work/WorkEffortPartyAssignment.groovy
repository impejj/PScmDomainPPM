package com.profesys.scientiam.pm.work

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.Enumeration
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.RoleType
import com.profesys.scientiam.security.User

 

class WorkEffortPartyAssignment {

	 String id
	Party party
	RoleType roleType
	Date fromDate
	Date thruDate
	Date statusDateTime
	String description
	String detail
 
 
	WorkEffort workEffort
	Enumeration delegateReasonEnum 
	Enumeration expectationEnum 
	 
 
	StatusItem availabilityStatus 
	StatusItem status
	
	
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
		detail type: "text"
	}

	static constraints = {
		id 				maxSize: 36,nullable: false  , display:true
		workEffort 		maxSize: 36,nullable: true , display:true
		party 			maxSize: 36,nullable: true  , display:true
		  description nullable: true
		  detail 		nullable: true   , display:true, size:0..65535 
	 
		  fromDate nullable: true   , display:true
		  thruDate nullable: true   , display:true
		  delegateReasonEnum nullable: true
		  expectationEnum nullable: true
		  availabilityStatus nullable: true
		  status nullable: true
		  
		    roleType nullable: true
		    statusDateTime nullable: true
		  
		state(nullable: true , display:false )
		userCreated(nullable: true , display:false )
		userUpdated(nullable: true , display:false )
		dateCreated(nullable: true , display:false )
		lastUpdated(nullable: true , display:false )
		dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${party}-${roleType}"
		}
}
