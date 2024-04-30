package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
