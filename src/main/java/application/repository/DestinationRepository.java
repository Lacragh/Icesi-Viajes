package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer>{

}
