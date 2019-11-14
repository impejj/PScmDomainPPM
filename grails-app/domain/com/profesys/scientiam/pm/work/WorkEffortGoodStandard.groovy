package com.profesys.scientiam.pm.work

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.crm.product.Product
import com.profesys.scientiam.security.User
 

class WorkEffortGoodStandard  {

 
 
	Date fromDate
	Date thruDate
	Double estimatedQuantity
	BigDecimal estimatedCost
	 
	WorkEffort workEffort
	Product product
	WorkEffortGoodStandardType workEffortGoodStandardType
	StatusItem statusItem
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted 
	 
	static belongsTo = [Product, StatusItem, WorkEffort, WorkEffortGoodStandardType]

 

	static constraints = {
		workEffort maxSize: 36
		product maxSize: 36
		workEffortGoodStandardType maxSize: 36
		thruDate nullable: true
		estimatedQuantity nullable: true
		estimatedCost nullable: true
		 state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
 
	String toString(){
		return "${id} "
		}
	
}
