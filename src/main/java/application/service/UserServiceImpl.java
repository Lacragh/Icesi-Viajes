package application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import application.domain.User;
import application.repository.UserRepository;

@Scope("singleton")
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		
		List<User> lstUser = userRepository.findAll();
		
		return lstUser;
	}

	@Override
	public Optional<User> findById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public User save(User entity) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.save(entity);
	}

	@Override
	public User update(User entity) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.save(entity);
	}

	@Override
	public void delete(User entity) throws Exception {
		// TODO Auto-generated method stub
		userRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public void validate(User entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}

}
