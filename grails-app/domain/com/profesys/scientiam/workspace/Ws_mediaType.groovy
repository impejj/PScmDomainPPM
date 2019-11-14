package com.profesys.scientiam.workspace

import java.util.Date;

import com.profesys.scientiam.configuration.DataType
import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.security.User;

class Ws_mediaType {

	/*
	 * Temas de estudios
	 * 
	 * 
	 */
	String id
	String           description

	//Seguridad & Auditoria
	 Integer                state   // 0-Borrado 1-ok  2-modificado
	 User  	          userCreated
	 User  	          userUpdated
	 Date             dateCreated  //Date  fechaalta
	 Date             lastUpdated  //Date  fechaactualizacion
	 Date             dateDeleted
	
	static constraints = {
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
		return "${id}- ${description}"
		}
	
}
