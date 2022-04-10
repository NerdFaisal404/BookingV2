package com.adservio.reservationv2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;


@Data
public class RoomDTO implements Serializable {
    Boolean isReserved = Boolean.FALSE;
    int counter = 0;
    private Long id;
    private String name;
    private DepartmentDTO department;
    @JsonIgnore
    private Collection<BookingDTO> bookings;


}
