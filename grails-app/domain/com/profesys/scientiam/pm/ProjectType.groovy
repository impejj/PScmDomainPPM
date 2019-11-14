package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.security.User;

class ProjectType {

	/*
	 * A que tipo de proyecto se refiere
	 * Desarrollo-Investigacion?- Ventas?- Marketing
	 * Capacitación- 
	 * A futuro podemos tener otras acciones disponibles segun el tipo de proyecto
	 * 
	 */

    String                 id
	String		         code
	String        description
    String			   detail
	ProjectType         parentType
	String          fontImage
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		id  nullable: false , display:true  ,maxSize: 36
		parentType  nullable: true , display:true  ,maxSize: 36
				   code(nullable: true , display:true )
	        description(nullable: false , display:true )
			     detail(nullable: true , display:true, size:0..65535  )
			  fontImage(nullable: true , display:true )
				 
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
	   detail type: 'text'
	}
	String toString(){
		return "${description}"
		}
}
 
