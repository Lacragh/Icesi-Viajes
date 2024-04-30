package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.Sale;
import application.repository.SaleRepository;

@Scope("singleton")
@Service
public class SaleServiceImpl implements SaleService{
	
	@Autowired
	private SaleRepository saleRepository;

	@Override
	public List<Sale> findAll() {
		
		List<Sale> lstSale = saleRepository.findAll();
		
		return lstSale;
	}

	@Override
	public Optional<Sale> findById(Integer id) {
		// TODO Auto-generated method stub
		return saleRepository.findById(id);
	}

	@Override
	public Sale save(Sale entity) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.save(entity);
	}

	@Override
	public Sale update(Sale entity) throws Exception {
		// TODO Auto-generated method stub
		return saleRepository.save(entity);
	}

	@Override
	public void delete(Sale entity) throws Exception {
		// TODO Auto-generated method stub
		saleRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		saleRepository.deleteById(id);
	}

	@Override
	public void validate(Sale entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return saleRepository.count();
	}

}
