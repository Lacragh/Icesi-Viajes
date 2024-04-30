package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.Reservation;
import application.repository.ReservationRepository;

@Scope("singleton")
@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public List<Reservation> findAll() {
		
		List<Reservation> lstReservation = reservationRepository.findAll();
		
		return lstReservation;
	}

	@Override
	public Optional<Reservation> findById(Integer id) {
		// TODO Auto-generated method stub
		return reservationRepository.findById(id);
	}

	@Override
	public Reservation save(Reservation entity) throws Exception {
		// TODO Auto-generated method stub
		return reservationRepository.save(entity);
	}

	@Override
	public Reservation update(Reservation entity) throws Exception {
		// TODO Auto-generated method stub
		return reservationRepository.save(entity);
	}

	@Override
	public void delete(Reservation entity) throws Exception {
		// TODO Auto-generated method stub
		reservationRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		reservationRepository.deleteById(id);
	}

	@Override
	public void validate(Reservation entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return reservationRepository.count();
	}

}
