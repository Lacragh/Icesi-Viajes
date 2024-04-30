package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.PlanDetail;
import application.repository.PlanDetailRepository;

@Scope("singleton")
@Service
public class PlanDetailServiceImpl implements PlanDetailService{
	
	@Autowired
	private PlanDetailRepository planDetailRepository;

	@Override
	public List<PlanDetail> findAll() {
		
		List<PlanDetail> lstPlanDetail = planDetailRepository.findAll();
		
		return lstPlanDetail;
	}

	@Override
	public Optional<PlanDetail> findById(Integer id) {
		// TODO Auto-generated method stub
		return planDetailRepository.findById(id);
	}

	@Override
	public PlanDetail save(PlanDetail entity) throws Exception {
		// TODO Auto-generated method stub
		return planDetailRepository.save(entity);
	}

	@Override
	public PlanDetail update(PlanDetail entity) throws Exception {
		// TODO Auto-generated method stub
		return planDetailRepository.save(entity);
	}

	@Override
	public void delete(PlanDetail entity) throws Exception {
		// TODO Auto-generated method stub
		planDetailRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		planDetailRepository.deleteById(id);
	}

	@Override
	public void validate(PlanDetail entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return planDetailRepository.count();
	}

}
