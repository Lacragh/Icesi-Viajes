package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.payload.LoginResponse;
import java.util.List;
import java.util.Optional;

import co.edu.icesi.viajes.dto.UserDTO;
import co.edu.icesi.viajes.dto.loginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.User;
import co.edu.icesi.viajes.repository.UserRepository;

@Scope("singleton")
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

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

	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(
				userDTO.getLogin(),
				this.passwordEncoder.encode(userDTO.getPassword()),
				userDTO.getFirst_name(),
				userDTO.getLast_name(),
				userDTO.getNum_id(),
				"true"
		);
		userRepository.save(user);
		return user.getFirst_name();
	}

	@Override
	public LoginResponse loginUser(loginDTO loginDTO) {
		String msg = "";
		User user = userRepository.findByLogin1(loginDTO.getEmail());
		if (user != null){
			String password = loginDTO.getPassword();
			String encodePassword = user.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodePassword);
			if (isPwdRight){
				Optional<User> user1 = userRepository.findByLoginAndPassword(loginDTO.getEmail(),encodePassword);
				if(user1.isPresent()) {
					return new LoginResponse("Login Success", true);
				}else{
					return new LoginResponse("Login Failed", false);
				}
			}else{
				return new LoginResponse("Password Not Match", false);
			}
		}else{
			return new LoginResponse("Email not exist", false);
		}
	}


}
