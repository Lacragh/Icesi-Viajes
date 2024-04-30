package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
