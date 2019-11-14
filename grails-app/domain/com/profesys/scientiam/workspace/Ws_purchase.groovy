package com.profesys.scientiam.workspace

	import java.util.Date;

 

import com.profesys.scientiam.security.User;

class Ws_purchase  {
	
	/*
	 * En este modulo incluiremos todos los elementos sobre los que tengo que 
	 * ir obteniendo informacion para realizar la compra.
	 * 
	 * Como todos los dominios del workspace, debe incluir una opcion de publicacion
	 * 
	 */

	Integer   internalOrder
	String      description    //
	BigDecimal        cost    //
	Date         dateExpense    //Fecha del Gasto
	Boolean        hasTicket
	Boolean        hasInvoice  
	String           detail
	Integer         urgency    // Cuan urgente debe resolverse
	Boolean       completed
	String           link1
	String           link2
	
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	  
static constraints = {
		   description(nullable: false  , display:true  )
		   dateExpense(nullable: true  , display:true  )
			     cost(nullable: true  , display:true , scale:2 )
				hasTicket(nullable: true , display:true )
				hasInvoice(nullable: true , display:true )
				detail(nullable: true   , display:true, size:0..65535   )
				urgency(nullable: false , display:true, range:1..10   )
				completed (nullable: false , display:true  )
				link1(nullable: true , display:true, url:true  )
				link2(nullable: true , display:true, url:true   )
				
				
				
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
static mapping = {
	detail type: "text"
}
String toString(){
	return "${id}- ${description}"
	}
 
}
