package com.profesys.scientiam.pm.work

import java.util.Date;

import com.profesys.scientiam.configuration.StatusItem;
import com.profesys.scientiam.pm.Project;
import com.profesys.scientiam.pm.ProjectTaxonomy
import com.profesys.scientiam.security.User;

class Task {
	
	String             				  id 
	
	TaskExecutionType  taskExcecutionType       /*Tipos de acciones - ASAP (HACER LO antes posible ) 
	 								                  Una fecha/rango determinado ( PROGRAMDA )
	 								                  Me gustaría hacerlo algun dia (wished )
	 								             */ 
 
	String                      idOrigen       //id dentro del modulo origen
 
	String                			detail
	
	Integer             		   urgency     // Cuan urgente debe resolverse
	Integer               			 level     // Cuan importante/grave es el registro
	Integer           			complexity     // Cuan complejo es resolver este issue
	Integer               			energy     // Nivel de Energia necesaria para tomar este tema
	  	 
	 WorkEffort                 workEffort
	 
	//Seguridad & Auditoria
	Integer           state   // 0-Borrado 1-ok  2-modificado
	User  	    userCreated
	User  	    userUpdated
	Date        dateCreated  //Date  fechaalta
	Date        lastUpdated  //Date  fechaactualizacion
	Date        dateDeleted
	
	static mapping = {
		id   generator: "assigned"
		
		version true
		detail type: "text"
	}

	 
static constraints = {
	 		id 				maxSize: 36,nullable: false  , display:true
			
    taskExcecutionType 		nullable: true   , display:true
		        detail 		nullable: true   , display:true, size:0..65535 
		       urgency 		nullable: true   , display:true, range:1..10     
		         level   	 nullable: true   , display:true, range:1..10     
		    complexity 		nullable: true   , display:true, range:1..10    
				energy 		nullable: true   , display:true, range:1..10    
			  idOrigen 		maxSize: 36,nullable: true   , display:true   
 	 
			    
		  
			     state nullable: true , display:false  
		   userCreated nullable: true , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false  
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}


	String toString(){
		return "${workEffort}"
		}
	
 
}
