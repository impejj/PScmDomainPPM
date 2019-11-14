package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 
class WorkEffortAssocAttribute   {

	String workEffortIdFrom
	String workEffortIdTo
	String workEffortAssocTypeId
	String attrName
	String attrValue
 
	WorkEffortAssoc workEffortAssoc

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [WorkEffortAssoc]

	 
	static constraints = {
		workEffortIdFrom maxSize: 36
		workEffortIdTo maxSize: 36
		workEffortAssocTypeId maxSize: 36
		attrName maxSize: 60
		attrValue nullable: true
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
