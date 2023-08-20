package com.challenge.Spring.Boot.challenge.business;

import com.challenge.Spring.Boot.challenge.dto.BookingData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingBusiness {

     Boolean createBooking();
     List<BookingData> getBookings();
     BookingData getBookingbyId(Long id);
     Boolean deleteBooking();
}
