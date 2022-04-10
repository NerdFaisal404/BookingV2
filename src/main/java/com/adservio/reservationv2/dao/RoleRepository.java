package com.adservio.reservationv2.dao;


import com.adservio.reservationv2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}