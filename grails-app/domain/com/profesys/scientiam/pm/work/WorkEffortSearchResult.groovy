package com.profesys.scientiam.pm.work
import com.profesys.scientiam.security.User

class WorkEffortSearchResult {

	String id
	String orderByName
	Character isAscending
	BigDecimal numResults
	Double secondsTotal
	Date searchDate
	 
//	Visit visit
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static hasMany = [workEffortSearchConstraints: WorkEffortSearchConstraint]
//	static belongsTo = [Visit]

	static mapping = {
		id column: "work_effort_search_result_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		orderByName nullable: true
		isAscending nullable: true, maxSize: 1
		numResults nullable: true
		secondsTotal nullable: true
		searchDate nullable: true
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
