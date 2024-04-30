package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.Destination;
import application.repository.DestinationRepository;

@Scope("singleton")
@Service
public class DestinationServiceImpl implements DestinationService{
	
	@Autowired
	private DestinationRepository destinationRepository;

	@Override
	public List<Destination> findAll() {
		
		List<Destination> lstDestination = destinationRepository.findAll();
		
		return lstDestination;
	}

	@Override
	public Optional<Destination> findById(Integer id) {
		// TODO Auto-generated method stub
		return destinationRepository.findById(id);
	}

	@Override
	public Destination save(Destination entity) throws Exception {
		// TODO Auto-generated method stub
		return destinationRepository.save(entity);
	}

	@Override
	public Destination update(Destination entity) throws Exception {
		// TODO Auto-generated method stub
		return destinationRepository.save(entity);
	}

	@Override
	public void delete(Destination entity) throws Exception {
		// TODO Auto-generated method stub
		destinationRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		destinationRepository.deleteById(id);
	}

	@Override
	public void validate(Destination entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return destinationRepository.count();
	}

}
