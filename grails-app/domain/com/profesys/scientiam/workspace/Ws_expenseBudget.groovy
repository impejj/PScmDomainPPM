package com.profesys.scientiam.workspace

	import java.util.Date;

import com.profesys.scientiam.security.User;

class Ws_expenseBudget {
	static searchable = true
 
	Ws_expenseType     expenseType
	 
	String             description    //
	BigDecimal              amount    //
	Date                  fromDate    //Fecha del Gasto
	Date                  	toDate    //Fecha del Gasto
	Date			    budgetDate    // 
	 
	
	//Seguridad & Auditoria
	String                  ticket
	Integer                  state   // 0-Borrado 1-ok  2-modificado
	User  	           userCreated
	User  	           userUpdated
	Date               dateCreated  //Date  fechaalta
	Date               lastUpdated  //Date  fechaactualizacion
	Date               dateDeleted
	
	  
static constraints = {
		   expenseType(nullable: true  , display:true  )
		   description(nullable: true  , display:true  )
		      fromDate(nullable: true  , display:true  )
			    toDate(nullable: true  , display:true  )
			    amount(nullable: true  , display:true  )
		    budgetDate(nullable: true  , display:true  )
		     
				
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
