package com.example.my.login.endpoints;

import org.springframework.http.ResponseEntity;

class SimpleResponse {
	
	public static ResponseEntity<?> buildResponse(boolean result){
		ResponseEntity<?> response = null;
		if(result) {
			response = ResponseEntity.ok().build();
		} else {
			response = ResponseEntity.notFound().build();
		}
		return response;
	}
	
	public static ResponseEntity<?> buildResponse(Object object){
		ResponseEntity<?> response = null;
		if(object !=null) {
			response = ResponseEntity.ok(object);
		} else {
			response = ResponseEntity.notFound().build();
		}
		return response;
	}

}
