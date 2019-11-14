package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.security.User

class DeliverableType {

	/*
	 * 
	 */

    String                 id
	String		         code
	String        description
    String			   detail
	DeliverableType         parentType
	String          fontImage
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
					id maxSize: 36
				   code(nullable: false , display:true )
	        description(nullable: false , display:true )
			     detail(nullable: true , display:true, size:0..65535  )
			  fontImage(nullable: true , display:true )
			  parentType(nullable: true , display:true )
				 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	static mapping = {
		id   column: "deliverable_type_id",generator: "assigned"
		version true
	   detail type: 'text'
	}
	String toString(){
		return "${description}"
		}
}
