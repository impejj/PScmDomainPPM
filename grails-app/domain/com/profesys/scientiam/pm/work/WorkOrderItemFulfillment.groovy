package com.profesys.scientiam.pm.work
import com.profesys.scientiam.security.User

 

class WorkOrderItemFulfillment {

 
	 
	String shipGroupSeqId
	Date lastUpdatedStamp
	 
	WorkEffort workEffort
//	OrderHeader orderHeader
//	OrderItem orderItem

	 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [OrderHeader, OrderItem, WorkEffort]

 

	static constraints = {
		workEffort maxSize: 36
//		orderId maxSize: 36
//		orderItemSeqId maxSize: 36
		shipGroupSeqId nullable: true, maxSize: 36
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
