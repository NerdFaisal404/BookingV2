package com.adservio.reservationv2.service;

import com.adservio.reservationv2.dao.UserRepository;
import com.adservio.reservationv2.model.User;
import com.adservio.reservationv2.service.iservice.IUserService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsersList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }
}
