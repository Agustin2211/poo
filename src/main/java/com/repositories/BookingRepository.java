package com.poo.tpfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.tpfinal.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

		
}
