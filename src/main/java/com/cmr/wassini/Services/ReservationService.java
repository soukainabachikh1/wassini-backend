package com.cmr.wassini.Services;

import com.cmr.wassini.Models.Reservation;
import com.cmr.wassini.Repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    private final ReservationRepo reservationRepo;

    @Autowired
    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    public Optional<Reservation> getReservationById(Long id){
        return reservationRepo.findById(id);
    }

    public Optional<Reservation> getReservationByCinDefunt(String cinDefunt){
        return reservationRepo.findByCinDefunt(cinDefunt);
    }

    public Reservation createReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    public Reservation saveOrUpdate(Reservation reservation) {
        if (reservation.getCinDefunt() == "") {
            // If the ID is null, it's a new entity, so save it.
            return reservationRepo.save(reservation);
        } else {
            // If the ID is not null, check if an entity with that ID exists.
            Optional<Reservation> existingReservation = reservationRepo.findByCinDefunt(reservation.getCinDefunt());
            if (existingReservation.isPresent()) {
                // If an entity with the same ID exists, update it.
                Reservation updatedReservation = existingReservation.get();
                // Perform the updates here, e.g., updating fields.
//                updatedReservation.setId(reservation.getId());
                updatedReservation.setEndDate(reservation.getEndDate());
                updatedReservation.setEndHour(reservation.getEndHour());
                updatedReservation.setStartDate(reservation.getStartDate());
                updatedReservation.setStartHour(reservation.getStartHour());
                updatedReservation.setTel(reservation.getTel());
                updatedReservation.setNomComplet(reservation.getNomComplet());
                updatedReservation.setNomCompletArabe(reservation.getNomCompletArabe());
                updatedReservation.setUserRelationship(reservation.getUserRelationship());
                // Update other fields as needed.
                return reservationRepo.save(updatedReservation);
            } else {
                // If no entity with the same ID exists, treat it as a new entity and save it.
                return reservationRepo.save(reservation);
            }
        }}


}
