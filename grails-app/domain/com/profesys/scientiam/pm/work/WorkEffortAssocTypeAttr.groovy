package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 

class WorkEffortAssocTypeAttr   {

	String attrName
	 
	WorkEffortAssocType workEffortAssocType

  	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [WorkEffortAssocType]

	 

	static constraints = {
		workEffortAssocType maxSize: 36
		attrName maxSize: 60
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
