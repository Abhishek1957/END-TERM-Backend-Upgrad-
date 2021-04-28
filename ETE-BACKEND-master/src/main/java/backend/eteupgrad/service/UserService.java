package backend.eteupgrad.service;

import backend.eteupgrad.model.User;
import backend.eteupgrad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public void registerUser(User newUser){
		userRepository.register(newUser);
	}
}
