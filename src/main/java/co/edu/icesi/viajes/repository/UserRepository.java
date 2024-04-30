package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByLoginAndPassword(String login, String password);

    User findByLogin(String email);
}
