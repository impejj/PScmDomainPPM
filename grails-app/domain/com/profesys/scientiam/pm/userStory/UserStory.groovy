package com.profesys.scientiam.pm.userStory

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.pm.Project
import com.profesys.scientiam.pm.ProjectTaxonomy
import com.profesys.scientiam.pm.work.WorkEffort
import com.profesys.scientiam.pm.work.WorkEffortPartyAssignment
import com.profesys.scientiam.pm.work.WorkEffortType
import com.profesys.scientiam.security.User;
import com.profesys.scientiam.workspace.Ws_actionSource;

class UserStory {
	
	String            id
 	WorkEffort     	  workEffort   
 
 	String                detail
	Integer              urgency     // Cuan urgente debe resolverse
	Integer                level     // Cuan importante/grave es el registro
	Integer           complexity     // Cuan complejo es resolver este issue
	Integer               energy     

	Ws_actionSource actionSource   //Modulo origen de la acción
	String             idOrigen
	 Integer      relativePoints    //Para estimar los tiempos comparativamente con otras actividades
	 
	
	String                whatus
	String                howus
	String                whyus
	
 
	 
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
			id 				maxSize: 36,nullable: false  , display:true
		    idOrigen     nullable: true   
		        detail(nullable: true   , display:true, size:0..65535   )
				whatus(nullable: true   , display:true, size:0..65535   )
				howus(nullable: true   , display:true, size:0..65535   )
				whyus(nullable: true   , display:true, size:0..65535   )
		         urgency(nullable: true  , display:true, range:1..10   ) 
		     	level nullable: true, display:true, range:1..10
		       complexity(nullable: true  , display:true, range:1..10   )
				  energy(nullable: true  , display:true, range:1..10   )
				actionSource(nullable:true)
				
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
	whatus type: "text"
	howus type: "text"
	whyus type: "text"
 
	
//	detail type: "text"
}
	String toString(){
		return "${workEffort}"
		}
	
 
}
