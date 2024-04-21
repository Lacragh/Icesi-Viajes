package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
