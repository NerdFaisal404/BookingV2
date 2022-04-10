package com.adservio.reservationv2.dao;

import com.adservio.reservationv2.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Booking findByCode(String code);

    void deleteByCode(String code);

}