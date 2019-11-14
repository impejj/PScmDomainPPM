package com.profesys.scientiam.pm.requirement

 
import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.crm.product.Product
import com.profesys.scientiam.pm.Deliverable
import com.profesys.scientiam.pm.Project
import com.profesys.scientiam.pm.work.WorkEffort
 
import com.profesys.scientiam.security.User

class Requirement {

	String id
	WorkEffort workEffort
	String detail
	 
	BigDecimal estimatedBudget
	BigDecimal quantity
	 
	String reason
	String location
	 
	RequirementType requirementType
	
	Deliverable deliverable
	Product     product

	
	RequirementStatus statusItem

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "requirement_id", generator: "assigned"
		version true
		detail type: 'text'
	}

	static constraints = {
		id maxSize: 36
		workEffort nullable: false
		detail nullable: true
		estimatedBudget nullable: true
		quantity nullable: true, scale: 6
		reason nullable: true
		 
		  requirementType  nullable: true
		  
		  deliverable  nullable: true  
		  product nullable: true
		  fixedAsset  nullable: true
		  facility  nullable: true
		  location  nullable: true
		  
		  statusItem  nullable: true
		
		  state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
	
	String toString(){
		return "${workEffort.description}"
		}
}
