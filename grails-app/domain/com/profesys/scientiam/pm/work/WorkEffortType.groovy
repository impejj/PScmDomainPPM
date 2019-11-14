package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

class WorkEffortType {

	String id
	Character hasTable
	String description
 
	WorkEffortType parentType
	
	WorkEffortType workEffortTypeRoot
	Integer        sequentialOrder
	String         orderTag
	String         prefix
	Character 		isActionable
	String         fontImage
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	

	 

	static mapping = {
		id column: "work_effort_type_id", generator: "assigned"
		version true

	}

	static constraints = {
				    id maxSize: 36
		   	  hasTable nullable: true , display:true   , maxSize: 1
		   description nullable: true , display:true    
		   isActionable nullable: true , display:true
		parentType nullable: true , display:true
		orderTag nullable: true , display:true
   	   sequentialOrder nullable: true , display:true    
		 		prefix nullable: true , display:true   , maxSize: 15
			 fontImage nullable: true , display:true
		         state nullable: true , display:false
		   userCreated nullable: true , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false  
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
 
	String toString(){
		return "${description}"
		}
}
