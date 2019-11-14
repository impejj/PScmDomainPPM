package com.profesys.scientiam.pm.work

import com.profesys.scientiam.security.User

 
class WorkEffortBilling   {

 
 
	String invoiceItemSeqId
	Double percentage
	 
	WorkEffort workEffort
//	InvoiceItem invoiceItem
 	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

//	static belongsTo = [InvoiceItem, WorkEffort]

	 

	static constraints = {
		workEffort maxSize: 36
//		invoice maxSize: 36
		invoiceItemSeqId maxSize: 36
		percentage nullable: true
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
