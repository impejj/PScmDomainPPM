package com.profesys.scientiam.pm.requirement

 
import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User


class RequirementStatus  {

	Date statusDate
 
	Requirement requirement
	StatusItem status 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [Requirement, StatusItem]

 

	static constraints = {
		requirement maxSize: 36
		status maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
//		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
