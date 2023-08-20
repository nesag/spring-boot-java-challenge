package com.challenge.Spring.Boot.challenge.business.impl;

import com.challenge.Spring.Boot.challenge.business.BookingBusiness;
import com.challenge.Spring.Boot.challenge.dto.BookingData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingBusinessImpl implements BookingBusiness {
    @Override
    public Boolean createBooking() {
        return null;
    }

    @Override
    public List<BookingData> getBookings() {
        return null;
    }

    @Override
    public BookingData getBookingbyId(Long id) {
        return null;
    }

    @Override
    public Boolean deleteBooking() {
        return null;
    }
}
