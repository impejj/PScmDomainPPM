package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User
 

class WorkEffortTypeAssoc   {

	String id    //concateno los 3 campos principales + estructura fecha+hora+minuto+segundo
	WorkEffortTypeAssocHeader workEffortTypeAssocHeader
	WorkEffortType workEffortTypeTo
	WorkEffortAssocType workEffortAssocType
	BigDecimal sequenceNum
	 
	Double estimatedMilliSeconds
 
	 
	 
	 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id  generator: "assigned"
		version true
	}
	static constraints = {
		id maxSize: 80
		workEffortTypeAssocHeader maxSize: 36
		workEffortTypeTo maxSize: 36
		workEffortAssocType maxSize: 36
		sequenceNum nullable: true
		estimatedMilliSeconds nullable: true
		 
		
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
