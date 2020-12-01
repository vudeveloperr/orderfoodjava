package net.codejava.orderfoodspring.Auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.orderfoodspring.Auth.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String tendn);

	Boolean existsByUsername(String tendn);
	Boolean existsByEmail(String email);
}
