package com.presidio.Backend.Repo;

import com.presidio.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsernameOrEmail(String username, String email);
	Optional<User> findByEmail(String email);
}
