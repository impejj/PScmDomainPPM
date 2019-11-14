package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User
 

class WorkEffortSkillStandard   {

 
 
	Double estimatedNumPeople
	Double estimatedDuration
	BigDecimal estimatedCost
 
	WorkEffort workEffort
//	SkillType skillType

	 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [SkillType, WorkEffort]

 
	static constraints = {
		workEffort maxSize: 36
//		skillTypeId maxSize: 36
		estimatedNumPeople nullable: true
		estimatedDuration nullable: true
		estimatedCost nullable: true
		 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${id}- ${description}"
		}
}
