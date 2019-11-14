package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 

class WorkEffortTransBox {

	WorkEffort processWorkEffort
	String toActivityId
	String transitionId
	 
 

 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	static belongsTo = [WorkEffort]

	 

	static constraints = {
		processWorkEffort maxSize: 36
		toActivityId maxSize: 60
		transitionId maxSize: 60
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
