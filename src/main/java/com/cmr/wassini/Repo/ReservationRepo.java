package com.cmr.wassini.Repo;

import com.cmr.wassini.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
    // Retrieve all reservations
    List<Reservation> findAll();

}
