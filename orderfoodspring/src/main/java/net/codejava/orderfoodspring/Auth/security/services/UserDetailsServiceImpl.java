package net.codejava.orderfoodspring.Auth.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.codejava.orderfoodspring.Auth.models.User;
import net.codejava.orderfoodspring.Auth.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String tendn) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(tendn)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + tendn));

		return UserDetailsImpl.build(user);
	}
}
