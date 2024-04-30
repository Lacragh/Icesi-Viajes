package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{



}
