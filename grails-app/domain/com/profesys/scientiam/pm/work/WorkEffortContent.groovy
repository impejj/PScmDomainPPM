package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 

class WorkEffortContent   {

 
	//String contentId
	Date fromDate
	Date thruDate
	 
	WorkEffortContentType workEffortContentType
	WorkEffort workEffort
//	Content content
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
 
//	static belongsTo = [Content, WorkEffort, WorkEffortContentType]

	 

	static constraints = {
		workEffort maxSize: 36
//		contentId maxSize: 36
		workEffortContentType maxSize: 36
		thruDate nullable: true
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
