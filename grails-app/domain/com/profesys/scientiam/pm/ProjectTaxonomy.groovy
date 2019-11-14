package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class ProjectTaxonomy {
		
	/*
	 * Datos de la estructura del desarrollo 
	 * donde indicamos modulos, aplicacion, interface 
	 * Tendria que codificar cada interface del aplicativo 
	 * para poder identificar univocamente cada issue.
	 */
		String              id
		Project               project
	    String		      	  code   //Codigo identificatorio que utilizamos 
									 // también para hacer el sort 
									 //Por ejemplo 001.001.001 ( proyecto.modulo.elemento )
	   
 
		SoftwareComponentType componentType
		String	              description
	    String                detail
							//Agregado 2013-11-29
		Integer              active //Activo 0= no / 1= si
	
		ProjectTaxonomy  parentTaxonomy
		String            treeRoot
		String            level    //Le sumo 1 nivel al de sus ancestro
		Integer           nodeSequentialOrder
		ProjectTaxonomy  projectTaxonomyRoot
	
	//Seguridad & Auditoria

	Integer               state   // 0-Borrado 1-ok  2-modificado
	User  	        userCreated
	User  	        userUpdated
	Date            dateCreated  //Date  fechaalta
	Date            lastUpdated  //Date  fechaactualizacion
	Date            dateDeleted
	
	static constraints = {
		id nullable: false , display:true , maxSize: 36 
			project(nullable: false , display:true   )
			   code(nullable: false , display:true , maxSize: 36)
		description(nullable: false , display:true , maxSize: 60) //,matches:"[a-z A-Z1-9_]+"
		     detail(nullable: true , display:true   )
	  componentType(nullable: false , display:true   )
	  parentTaxonomy(nullable: true , display:true   )
			active(nullable: true , display:false )
		
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
		detail type: "text"
	}
	String toString(){
		return "${description}"
		}
	
	
}
