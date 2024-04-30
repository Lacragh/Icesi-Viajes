package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer>{

}
