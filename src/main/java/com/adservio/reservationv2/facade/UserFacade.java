package com.adservio.reservationv2.facade;

import com.adservio.reservationv2.dto.UserDTO;
import com.adservio.reservationv2.mapper.Converter;
import com.adservio.reservationv2.model.User;
import com.adservio.reservationv2.service.iservice.IUserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class UserFacade {
    private final IUserService userService;
    private final Converter userConverter;

    public ResponseEntity<List<User>> getUsersList(){
        List<User> users = userService.getAllUsersList();
        if(!users.isEmpty())
        return ResponseEntity.ok().body(users);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<UserDTO> getUserById(Long id){
        User user=userService.getUserById(id);
        UserDTO userDTO=userConverter.modelToDto(user,UserDTO.class);
        return ResponseEntity.ok().body(userDTO);
    }

}
