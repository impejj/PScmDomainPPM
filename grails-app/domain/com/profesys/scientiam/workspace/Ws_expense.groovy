package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_expense {
	static searchable = true

	Ws_cashAccount     cashAccount
	Ws_expenseType     expenseType
	Integer          internalOrder
	String             description    //
	BigDecimal              amount    //
	Date               expenseDate    //Fecha del Gasto
	Date			    budgetDate    // 
	boolean              hasTicket
	boolean             hasInvoice  
	
	//Seguridad & Auditoria
	String                  ticket
	Integer                  state   // 0-Borrado 1-ok  2-modificado
	User  	           userCreated
	User  	           userUpdated
	Date               dateCreated  //Date  fechaalta
	Date               lastUpdated  //Date  fechaactualizacion
	Date               dateDeleted
	
	  
static constraints = {
		   cashAccount(nullable: true  , display:true  )
		   expenseType(nullable: true  , display:true  )
		   description(nullable: true  , display:true  )
		   expenseDate(nullable: true  , display:true  )
			    amount(nullable: true  , display:true  )
		    budgetDate(nullable: true  , display:true  )
		     hasTicket(nullable: true  , display:true  )
		    hasInvoice(nullable: true  , display:true  )
				
	      internalOrder(nullable: true  , display:false)
	 			 ticket(nullable: true , display:false )
	 		      state(nullable: true , display:false )
	 	    userCreated(nullable: true , display:false )
	 	    userUpdated(nullable: true , display:false )
		    dateCreated(nullable: true , display:false )
	 	    lastUpdated(nullable: true , display:false )
	 	    dateDeleted(nullable: true , display:false )
	}

String toString(){
	return "${id}- ${description}"
	}

 
}
