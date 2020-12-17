package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Cancellation;

@Repository
public interface CancellationRepository extends JpaRepository<Cancellation, Long>{

		
}
