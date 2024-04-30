package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
