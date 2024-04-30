package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
