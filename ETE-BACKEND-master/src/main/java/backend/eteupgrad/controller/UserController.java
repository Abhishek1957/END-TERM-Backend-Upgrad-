package backend.eteupgrad.controller;

import backend.eteupgrad.model.User;
import backend.eteupgrad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("users/register")
	public String registerUser(User user){
		userService.registerUser(user);
		return "details";
	}
}
