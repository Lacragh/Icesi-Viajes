package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
