package com.profesys.scientiam.pm.work

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User

 
class WorkEffortAssignmentRate {

 
 
 
	Date fromDate
	Date thruDate
	BigDecimal rate
	 
	WorkEffort workEffort
//	RateType rateType
	Party party
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [Party, RateType, WorkEffort]

	 

	static constraints = {
		workEffort maxSize: 36
		//rateTypeId maxSize: 36
		party maxSize: 36
		thruDate nullable: true
		rate nullable: true
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
