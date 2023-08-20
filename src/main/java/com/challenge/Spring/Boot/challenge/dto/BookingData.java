package com.challenge.Spring.Boot.challenge.dto;

import org.springframework.stereotype.Service;

@Service
public class BookingData {
    private static String name;
    private static String email;
    private static String origin;
    private static String destination;
    private static String departureDate;
    private static String departureTime;
    private static String duration;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        BookingData.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        BookingData.email = email;
    }

    public static String getOrigin() {
        return origin;
    }

    public static void setOrigin(String origin) {
        BookingData.origin = origin;
    }

    public static String getDestination() {
        return destination;
    }

    public static void setDestination(String destination) {
        BookingData.destination = destination;
    }

    public static String getDepartureDate() {
        return departureDate;
    }

    public static void setDepartureDate(String departureDate) {
        BookingData.departureDate = departureDate;
    }

    public static String getDepartureTime() {
        return departureTime;
    }

    public static void setDepartureTime(String departureTime) {
        BookingData.departureTime = departureTime;
    }

    public static String getDuration() {
        return duration;
    }

    public static void setDuration(String duration) {
        BookingData.duration = duration;
    }
}
