package com.profesys.scientiam.pm

import java.util.Date;

import com.profesys.scientiam.configuration.Enterprise;
import com.profesys.scientiam.security.User;

class ProjectTree {
	   
	/*
	 * Arbol de Proyecto 
	 */
   
	Enterprise         enterprise 
	String                   code     //Codigo de Nodo
	String            description      //Descripción del nodo
	//NodeChartType     accountType   //Tipo de Cuenta Nodo o elemento
	 
	boolean              isFolder
	boolean                isNode     //Es un nodo 
	//Seguridad & Auditoria
	Integer                 state   // 0-Borrado 1-ok  2-modificado
	User  	          userCreated
	User    	      userUpdated
	Date              dateCreated  //Date  fechaalta
	Date              lastUpdated  //Date  fechaactualizacion
	Date              dateDeleted
	 
	
	static constraints = {
				 
		    enterprise(nullable: false , display:true )
				  code(nullable: false , display:true, size: 1..12 )
		   description(nullable: false , display:true )
		   //nodeChartType(nullable: false , display:true )
		    isFolder(nullable: true , display:true )
		   isNode(nullable: true , display:true )
		   
			     state(nullable: true , display:false )
		   userCreated(nullable: true , display:false )
		   userUpdated(nullable: true , display:false )
		   dateCreated(nullable: true , display:false )
		   lastUpdated(nullable: true , display:false )
		   dateDeleted(nullable: true , display:false )
	}
	
	String toString(){
		return "${code} - ${description}  "
		}
}
