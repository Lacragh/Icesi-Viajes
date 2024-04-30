package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.domain.PlanDetail;

public interface PlanDetailRepository extends JpaRepository<PlanDetail, Integer>{

}
