package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User
 

class WorkEffortAssoc   {
	String     id 
	WorkEffort workEffortIdFrom
	WorkEffort workEffortIdTo
	WorkEffortAssocType workEffortAssocType
	Date fromDate
	BigDecimal sequenceNum
	Date thruDate

	WorkEffortAssoc workEffortAssocParent
	String         			orderTag
	WorkEffortAssoc workEffortAssocRoot

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id   generator: "assigned"
 		workEffortIdFrom column: "work_effort_id_from" 
		workEffortIdTo   column: "work_effort_id_to"
		orderTag type: 'text'

		version true
	}
	static constraints = {
		workEffortIdFrom maxSize: 36
		workEffortIdFrom maxSize: 36
		workEffortIdTo maxSize: 36
		workEffortAssocType maxSize: 36
		workEffortAssocParent nullable: true ,  maxSize: 36
		workEffortAssocRoot  nullable: true , maxSize: 36

		sequenceNum nullable: true
		thruDate nullable: true
		 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
		orderTag  	nullable: true	, display:false, size:0..3072

	}
 
	String toString(){
		return "${id} "
		}
	
}
