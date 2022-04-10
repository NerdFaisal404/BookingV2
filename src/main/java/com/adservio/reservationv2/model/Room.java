package com.adservio.reservationv2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Boolean isReserved = Boolean.FALSE;
    int counter = 0;
    @Column(nullable = false)
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private Collection<Booking> bookings = new ArrayList<>();
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Department department;


}