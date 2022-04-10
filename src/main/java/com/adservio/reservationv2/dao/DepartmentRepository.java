package com.adservio.reservationv2.dao;

import com.adservio.reservationv2.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByName(String name);
}