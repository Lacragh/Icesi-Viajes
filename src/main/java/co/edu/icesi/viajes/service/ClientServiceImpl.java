package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Client;
import co.edu.icesi.viajes.repository.ClientRepository;

@Scope("singleton")
@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> findAll() {
		
		List<Client> lstCliente = clientRepository.findAll();
		
		return lstCliente;
	}

	@Override
	public Optional<Client> findById(Integer id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id);
	}

	@Override
	public Client save(Client entity) throws Exception {
		// TODO Auto-generated method stub
		return clientRepository.save(entity);
	}

	@Override
	public Client update(Client entity) throws Exception {
		// TODO Auto-generated method stub
		return clientRepository.save(entity);
	}

	@Override
	public void delete(Client entity) throws Exception {
		// TODO Auto-generated method stub
		clientRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}

	@Override
	public void validate(Client entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return clientRepository.count();
	}

}
