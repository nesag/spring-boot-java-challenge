package com.challenge.Spring.Boot.challenge.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


public class ResponseHandler {

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object objectResponse){
        Map<String, Object> mapResponse = new HashMap<>();
        mapResponse.put("message", message);
        mapResponse.put("status", status.value());
        mapResponse.put("data", objectResponse);
        return new ResponseEntity<>(mapResponse, status);
    }
}
