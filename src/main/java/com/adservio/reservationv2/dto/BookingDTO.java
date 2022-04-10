package com.adservio.reservationv2.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.FutureOrPresent;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO implements Serializable {
    LocalDateTime startDate;
    LocalDateTime endDate;
    private Long id;
    private String description;
    private String code;
    private Boolean isConfirmed=Boolean.FALSE;
    private RoomDTO room;
    private UserDTO user;

}