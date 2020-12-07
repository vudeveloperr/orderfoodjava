package net.codejava.orderfoodspring.Auth.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import net.codejava.orderfoodspring.Auth.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String tendn);

	Boolean existsByUsername(String tendn);
	Boolean existsByEmail(String email);
	Optional<User> findById(Integer id);

	@Modifying
	@Query(value = "UPDATE users set username = ?2, password = ?3, email= ?4 where id= ?1", nativeQuery = true)
    List<User> updateUser(Integer id, String username,String password,String email);
}
