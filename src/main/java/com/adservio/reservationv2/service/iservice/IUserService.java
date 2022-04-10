package com.adservio.reservationv2.service.iservice;

import com.adservio.reservationv2.model.User;

import java.util.List;

public interface IUserService {
    public List<User> getAllUsersList();
    public User getUserById(Long id);
}
