package com.profesys.scientiam.pm.work
import com.profesys.scientiam.security.User

 

class WorkEffortCostCalc  {

	 String id
	 
	Date fromDate
	Date thruDate
	 
	WorkEffort workEffort
//	CostComponentType costComponentType
//	CostComponentCalc costComponentCalc

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [CostComponentCalc, CostComponentType, WorkEffort]

	 
	static constraints = {
		workEffort maxSize: 36
//		costComponentType maxSize: 36
		thruDate nullable: true
		 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	static mapping = {
		id   generator: "assigned"
		version true
	}
	String toString(){
		return "${id} "
		}
	
}
