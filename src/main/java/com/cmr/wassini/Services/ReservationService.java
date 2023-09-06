package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Reservation;
import com.cmr.wassini.Repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    public Reservation createReservation(Reservation reservation) {return reservationRepo.save(reservation);
    }
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    public List<Reservation> findReservationsByCinDefunt(String cin) {
        return reservationRepo.findReservationsByDefuntCin(cin);
    }

//    public List<Reservation> findReservationById(Long id){return reservationRepo.findReservationsById(id);}
//    public List<Reservation> findReservationsByCinDefunt(String cin){
//        return reservationRepo.findReservationsByCinDefunt(cin);
//    }





}
