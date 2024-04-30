package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.DestinationType;

@Scope("singleton")
@Service
public class DestinationTypeServiceImpl implements DestinationTypeService{

	@Override
	public List<DestinationType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DestinationType> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public DestinationType save(DestinationType entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DestinationType update(DestinationType entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DestinationType entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate(DestinationType entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

}
