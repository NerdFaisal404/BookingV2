package com.adservio.reservationv2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;

@Data
public class DepartmentDTO implements Serializable {
    private Long id;
    private String name;
    @JsonIgnore
    private Collection<RoomDTO> room;
}
