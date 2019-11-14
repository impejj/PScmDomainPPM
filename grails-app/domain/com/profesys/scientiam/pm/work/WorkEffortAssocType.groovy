package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

class WorkEffortAssocType {

	String id
	Character hasTable
	String description
	 
	WorkEffortAssocType parentType
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static hasMany = [workEffortAssocTypeAttrs: WorkEffortAssocTypeAttr,
//	                  workEffortAssocTypes: WorkEffortAssocType,
//	                  workEffortAssocs: WorkEffortAssoc]
	static belongsTo = [   parentType: WorkEffortAssocType ]
	
	 static mappedBy = [   parentType: "none" ]
 
	static mapping = {
		id column: "work_effort_assoc_type_id", generator: "assigned"
		version true
		parentType cascade: 'all'
	}

	static constraints = {
		id maxSize: 36
		parentType maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		 state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true 
	}
	String toString(){
		return "${description}"
		}
}
