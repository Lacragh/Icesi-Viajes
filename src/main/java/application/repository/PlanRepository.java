package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer>{

}
