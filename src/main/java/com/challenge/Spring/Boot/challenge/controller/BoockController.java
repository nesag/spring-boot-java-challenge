package com.challenge.Spring.Boot.challenge.controller;


import com.challenge.Spring.Boot.challenge.business.BookingBusiness;
import com.challenge.Spring.Boot.challenge.dto.BookingData;
import com.challenge.Spring.Boot.challenge.response.ResponseHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoockController {

    private final BookingBusiness business;

    public BoockController(@Qualifier("bookingBusiness") BookingBusiness business) {
        this.business = business;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getBook(@PathVariable("id") Long id){
        try{
            BookingData bookingData = business.getBookingbyId(id);

            return ResponseHandler.generateResponse("message", HttpStatus.OK, bookingData);
        }catch (Exception e){
            return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
        }
    }

}
