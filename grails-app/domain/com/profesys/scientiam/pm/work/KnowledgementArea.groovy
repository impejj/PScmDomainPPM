package com.profesys.scientiam.pm.work

import java.util.Date;

import com.profesys.scientiam.security.User;


class KnowledgementArea {

	String id
	Character hasTable
	String description
	Integer nodeSequencialOrder
	KnowledgementArea parentKnowledgment
	
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated   //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 

	static mapping = {
		id   generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		nodeSequencialOrder nullable: true
		hasTable nullable: true, maxSize: 1
		description nullable: true
		parentKnowledgment nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
//		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
	
	String toString(){
		return "${description}"
	}
}
