package com.profesys.scientiam.pm

import com.profesys.scientiam.security.User

class MeetingType {
	
	/*
	 * Tipo de Reunion
	 *
	 */

    String               id
	String		         code
	String        description

	
	 
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		id  nullable: false , display:true  ,maxSize: 36
				   code(nullable: false , display:true )
	        description(nullable: false , display:true )

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
		return "${description}"
		}
}
