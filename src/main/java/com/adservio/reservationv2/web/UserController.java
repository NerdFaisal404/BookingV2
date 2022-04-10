package com.adservio.reservationv2.web;

import com.adservio.reservationv2.dto.UserDTO;
import com.adservio.reservationv2.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v2")
public class UserController {
private final UserFacade userFacade;

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return userFacade.getUserById(id);
    }

}
