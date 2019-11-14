package com.profesys.scientiam.pm.work

 
import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.configuration.Enumeration
import com.profesys.scientiam.erp.party.Party;
import com.profesys.scientiam.pm.Project
import com.profesys.scientiam.pm.ProjectTaxonomy;
import com.profesys.scientiam.security.User

class WorkEffort {

	String 					id
    String 					code
	String 					description
	String         			prefix       //prefijo de 15 caracteres max que vamos a utilizar para "nombrar" workEffort Dependientes

	WorkEffortType 			workEffortType
	WorkEffortPurposeType 	workEffortPurposeType
	WorkEffort     			workEffortParent
	
	Project                 project
	ProjectTaxonomy         projectTaxonomy
	Party          			ownerParty

	Date 					estimatedStartDate
	Date 					estimatedCompletionDate
	Date 					actualStartDate
	Date 					actualCompletionDate
	
	
	Date                    followUpDate    //Fecha de seguimiento  
	Date                    dueDate	  		//Fecha de vencimiento   

	Date                    delegatedFollowUpDate    //Fecha de seguimiento para las acciones delegadas
	Date                    delegatedDueDate	  //Fecha de vencimiento para las acciones delegadas

 
	WorkEffortEstimationType estimationType
	Double                   estimatedUnits
	Double                   actualUnits         //Debe coincidir con los minutos informados en timesheet
	 
	   					 
	Double                  totalUnitsAllowed
	BigDecimal 				totalAllowedUnits
	BigDecimal 				totalAllowedMoney
	 
	Integer 				percentCompleted
	
	Enumeration 			scopeEnum 
	StatusItem 				currentStatus
 
	Uom            			moneyUom			//Por defecto deberia ser la misma del proyecto 
												//que la contiene
	
	Integer        			sequentialOrder
	String         			orderTag
	String         			ticket    		//Es igual al id
	
	String         			tagCloud
	
	 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "work_effort_id", generator: "assigned"
		version true
	}

	static constraints = {
		 id 						nullable: false	, display:false,	maxSize: 36
		 prefix 					nullable: true	, display:true,		maxSize: 15
		 description 				nullable: true	, display:true	 
		 workEffortPurposeType 		nullable: true	, display:true	 
		 workEffortType 			nullable: true	, display:true	 
		 project					nullable: true	, display:true
		 projectTaxonomy 			nullable: true   , display:true
		 currentStatus              nullable: true   , display:true
		 code 						nullable: false	, display:true,		maxSize: 50
		 moneyUom 					nullable: true
		 
		 ownerParty 				nullable: true, display:true
		 workEffortParent 			nullable: true, display:true
		 
		 estimatedStartDate 		nullable: true, display:true
		 estimatedCompletionDate 	nullable: true, display:true
		 actualStartDate 			nullable: true, display:true
		 actualCompletionDate 		nullable: true, display:true
		 estimatedUnits			    nullable: true, display:true
		 actualUnits				nullable: true, display:true
		 
		 estimationType				nullable: true	, display:true
		 estimatedUnits				nullable: true	, display:true
		 actualUnits         		nullable: true	, display:true//Debe coincidir con los minutos informados en timesheet
		 totalUnitsAllowed			nullable: true	, display:true
		 totalAllowedUnits			nullable: true	, display:true
		 totalAllowedMoney			nullable: true	, display:true
		 percentCompleted 			nullable: true	, display:true

		 scopeEnum 					nullable: true   , display:true
		 dueDate 					nullable: true   , display:true
		 followUpDate 				nullable: true   , display:true
		 delegatedFollowUpDate 		nullable: true   , display:true
		 delegatedDueDate			nullable: true   , display:true	
		 
		 
		 tagCloud  					nullable: true	, display:false  
		 sequentialOrder 			nullable: true	, display:false  
		 orderTag 					nullable: true	, display:false  
		 
		 state 						nullable: true , display:false  
		 userCreated 				nullable: true , display:false  
		 userUpdated 				nullable: true , display:false  
		 dateCreated 				nullable: true , display:false  
		 lastUpdated 				nullable: true , display:false  
		 dateDeleted 				nullable: true , display:false  
	}
 
	String toString(){
		return "${description}"
		}
	
	String identification(){
		return "${project?.getPrefix()}-${workEffortType.prefix}-${prefix}-${code}"
		}
}
