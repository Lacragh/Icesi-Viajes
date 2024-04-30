package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.DestinationType;

public interface DestinationTypeRepository extends JpaRepository<DestinationType, Integer>{

}
