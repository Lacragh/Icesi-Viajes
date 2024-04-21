package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import domain.Plan;
import repository.PlanRepository;

@Scope("singleton")
@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanRepository planRepository;

	@Override
	public List<Plan> findAll() {
		
		List<Plan> lstPlan = planRepository.findAll();
		
		return lstPlan;
	}

	@Override
	public Optional<Plan> findById(Integer id) {
		// TODO Auto-generated method stub
		return planRepository.findById(id);
	}

	@Override
	public Plan save(Plan entity) throws Exception {
		// TODO Auto-generated method stub
		return planRepository.save(entity);
	}

	@Override
	public Plan update(Plan entity) throws Exception {
		// TODO Auto-generated method stub
		return planRepository.save(entity);
	}

	@Override
	public void delete(Plan entity) throws Exception {
		// TODO Auto-generated method stub
		planRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		planRepository.deleteById(id);
	}

	@Override
	public void validate(Plan entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return planRepository.count();
	}

}
