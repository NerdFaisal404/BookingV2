package com.adservio.reservationv2.service;

import com.adservio.reservationv2.dao.RoleRepository;
import com.adservio.reservationv2.dao.UserRepository;
import com.adservio.reservationv2.model.Role;
import com.adservio.reservationv2.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@RequiredArgsConstructor
@Service
public class SampleInitData implements CommandLineRunner {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    public void initUsers(){
        User u = User.builder().
                firstName("test").
                lastName("user1").
                username("TestUser1").
                email("TestEmail@test.com")
                .password("password")
                .build();
        u.setRoles(Collections.singletonList(roleRepository.findByName("ADMIN")));
        userRepository.save(u);
    }

    public void initRoles() {
        Role R = new Role();
        Role U = new Role();
        R.setName("ADMIN");
        U.setName("USER");
        roleRepository.save(R);
        roleRepository.save(U);
    }

    @Override
    public void run(String... args) throws Exception {
        initRoles();
        initUsers();
    }
}
