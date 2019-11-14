package com.profesys.scientiam.pm.requirement

 
import java.util.Date;

import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.PartyRole
import com.profesys.scientiam.security.User


class RequirementRole  {

	Date fromDate
	Date thruDate
	 
	Requirement requirement
	PartyRole roleType
	Party party

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated = new Date() //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [Party, PartyRole, Requirement]

	 

	static constraints = {
		requirement maxSize: 36
		party maxSize: 36
		roleType maxSize: 36
		thruDate nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
