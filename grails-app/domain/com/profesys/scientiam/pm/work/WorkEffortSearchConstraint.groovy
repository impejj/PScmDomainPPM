package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 

class WorkEffortSearchConstraint   {

	 
	String constraintSeqId
	String constraintName
	String infoString
	Character includeSubWorkEfforts
	Character isAnd
	Character anyPrefix
	Character anySuffix
	Character removeStems
	String lowValue
	String highValue
 
	WorkEffortSearchResult workEffortSearchResult

	 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [WorkEffortSearchResult]

	 

	static constraints = {
		workEffortSearchResult maxSize: 36
		constraintSeqId maxSize: 36
		constraintName nullable: true
		infoString nullable: true
		includeSubWorkEfforts nullable: true, maxSize: 1
		isAnd nullable: true, maxSize: 1
		anyPrefix nullable: true, maxSize: 1
		anySuffix nullable: true, maxSize: 1
		removeStems nullable: true, maxSize: 1
		lowValue nullable: true, maxSize: 60
		highValue nullable: true, maxSize: 60
	 
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
