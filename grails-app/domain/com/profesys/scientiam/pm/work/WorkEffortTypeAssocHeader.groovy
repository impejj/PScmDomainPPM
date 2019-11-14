package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User
 

class WorkEffortTypeAssocHeader   {

	String id    //concateno los 3 campos principales + estructura fecha+hora+minuto+segundo
 
  	 WorkEffortType workEffortType // Esfuerzo "agrupador" de todas las tareas accionables
	 String description
	 String detail
	 

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id   generator: "assigned"
		version true
		detail type: "text"
	}
	static constraints = {
		id maxSize: 80
		description nullable: true
		detail nullable: true, display:true, size:0..65535 
		
		workEffortType  nullable: true
		 state nullable: true , display:false  
		   userCreated nullable: true , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false  
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
 
	String toString(){
		return "${description} "
		}
	
}
