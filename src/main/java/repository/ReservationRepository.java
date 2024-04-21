package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
