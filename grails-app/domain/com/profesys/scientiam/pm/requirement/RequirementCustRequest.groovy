package com.profesys.scientiam.pm.requirement

 
import java.util.Date;

import com.profesys.scientiam.security.User

class RequirementCustRequest   {

	String id
	String custRequestItemSeq
	 
	 
//	CustRequestItem custRequestItem
	Requirement requirement
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated = new Date() //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	//static belongsTo = [CustRequestItem, Requirement]

	static mapping = {
		id   generator: "assigned"
		version true
		 
	 
		
	//	detail type: "text"
	}


	static constraints = {
		id maxSize: 36
		custRequestItemSeq maxSize: 36
		requirement maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
