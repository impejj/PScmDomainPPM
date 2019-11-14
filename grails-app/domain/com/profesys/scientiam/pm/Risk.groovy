package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.pm.RiskClassification
import com.profesys.scientiam.security.User;

class Risk {

    
	//Estos son los pedidos que se realizan y que despues de una evaluacion se pueden 
	//transformar en un task o issue
	//Puede tener todo el conjunto de servicios asociados ( links-documentos-
	
	String                id
    String             ticket   
	 String              code
  
	Integer              probability     // Cual probable es que suceda
	Integer               level          // Cuan grave es el riesgo
	String			   detail
	RiskClassification riskClassification		
	
							
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	static mapping = {
		id   generator: "assigned"
		version true
		detail type: "text"
		
	}
	static constraints = {
					 id  nullable: false , display:true  ,maxSize: 36
	                      code nullable: false , display:true  
	                    detail nullable: true , display:true, size:0..65535    
		   			    ticket nullable: false , display:false  
				probability nullable: true , display:true 
				level nullable: true , display:true 
						 state nullable: true , display:false  
				   userCreated nullable: true , display:false  
				   userUpdated nullable: true , display:false  
				   dateCreated nullable: true , display:false  
				   lastUpdated nullable: true , display:false  
				   dateDeleted nullable: true , display:false  
	}
	
	 
	String toString(){
		return "${id}- ${code}"
		}
}
