package com.profesys.scientiam.pm.component

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.pm.ProjectTaxonomy
import com.profesys.scientiam.security.User;

class Domain {

    
	String		       code
	String        	   description
    String			   detail
	ProjectTaxonomy   projectTaxonomy
	
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	
	static constraints = {
		
			      code(nullable: false , display:true )
	       description(nullable: false , display:true )
	 	        detail(nullable: true , display:true, size:0..65535 )
	  projectTaxonomy(nullable: true , display:true  )
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	
	static mapping = {
		
	   detail type: 'text'
	}
	String toString(){
		return "${id}- ${description}"
		}
}
