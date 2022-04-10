package com.adservio.reservationv2.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    @JsonIgnore
    private Collection<RoleDTO> roles = new ArrayList<>();
    @JsonIgnore
    private Collection<BookingDTO> bookings;

}