package com.profesys.scientiam.workspace


import java.util.Date;

import com.profesys.scientiam.security.User;


class Ws_person {
	
	String id
    String name

	
    static belongsTo = [ parent: Ws_person ]

    static mappedBy = [   parent: "none" ]

    static constraints = {
			 	 id	 maxSize: 36
				name nullable: false , display:true  
			  parent nullable: true  , display:true 
			   }
 
    
	static mapping = {
		// detail type: "text"  //Para los campos de texto largo
		id column: 'ws_personId', generator: 'assigned'
	 
		version true
		parent cascade: 'all'
	}
 
	String toString(){
		return "${name}"
	}
}
