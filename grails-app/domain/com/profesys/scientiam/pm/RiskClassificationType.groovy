package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.erp.party.PartyType;
import com.profesys.scientiam.security.User;

class RiskClassificationType {
	
	/*
	 * A que tipo de proyecto se refiere
	 * Desarrollo-Investigacion?- Ventas?- Marketing
	 * Capacitación- 
	 * A futuro podemos tener otras acciones disponibles segun el tipo de proyecto
	 * 
	 */

    
	  String   id
	Character   hasTable
	   String   description
	RiskClassificationType   parentType
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static mapping = {
		id column: "risk_classification_type_id", generator: "assigned"
		version true
		parentType cascade: 'all'
	}
	static constraints = {
		
				   id(nullable: true , display:true , maxSize: 36)
	        description(nullable: true , display:true )
			hasTable(nullable: true , display:true )
			parentType(nullable: true , display:true )
				 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	
 
	String toString(){
		return "${description}"
		}
}
 
