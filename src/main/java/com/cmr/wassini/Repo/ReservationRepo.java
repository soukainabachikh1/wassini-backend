package com.cmr.wassini.Repo;

import com.cmr.wassini.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {

}
