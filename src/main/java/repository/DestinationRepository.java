package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer>{

}
