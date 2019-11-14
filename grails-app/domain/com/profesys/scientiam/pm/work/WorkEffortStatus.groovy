package com.profesys.scientiam.pm.work

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.security.User

class WorkEffortStatus   {

	WorkEffort workEffort
	Date statusDatetime
	String reason
 
 
 
	StatusItem status
 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static belongsTo = [StatusItem,   WorkEffort]

 

	static constraints = {
		workEffort maxSize: 36
		status maxSize: 36
		reason nullable: true
	 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${id} "
		}
}
