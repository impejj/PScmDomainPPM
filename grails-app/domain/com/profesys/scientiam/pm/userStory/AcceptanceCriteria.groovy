package com.profesys.scientiam.pm.userStory

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.pm.Project
import com.profesys.scientiam.pm.ProjectTaxonomy
import com.profesys.scientiam.pm.work.WorkEffort
import com.profesys.scientiam.pm.work.WorkEffortType
import com.profesys.scientiam.security.User;
import com.profesys.scientiam.workspace.Ws_actionSource;

class AcceptanceCriteria {
	
	String              id
	String              code
 	String            description      
	 UserStory          userStory
	 Integer			scenario
 	String            acceptanceCriteria
	String             context 
	String               event 
	String            expectedResult 
	
    String               ticket
	 
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  

	static constraints = {
		id maxSize: 36, display:true
	 
		   description(nullable: false  , display:true  )
		   code maxSize: 50,nullable: true  , display:true
		   
		   	userStory nullable: true  , display:true
			     code nullable: true  , display:true
            description nullable: true  , display:true
          userStory nullable: true  , display:true
			scenario nullable: true  , display:true
            acceptanceCriteria nullable: true  , display:true
            context nullable: true  , display:true
                event nullable: true  , display:true
			   expectedResult nullable: true  , display:true
			   
	    		ticket(nullable: true   , display:true  )
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
