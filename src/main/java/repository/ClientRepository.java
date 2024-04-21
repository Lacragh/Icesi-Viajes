package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
