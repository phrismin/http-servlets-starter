package com.rudoy.http.entity;

import java.time.LocalDateTime;

public class Flight {
    private Long id;
    private String flightNo;
    private LocalDateTime departureDate;
    private String departureAirportCode;
    private LocalDateTime arriveDate;
    private String arrivalAirportCode;
    private Integer aircraftId;
    private FlightStatus status;


}
