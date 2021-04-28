package backend.eteupgrad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String home(){
		return "index";
	}

	@GetMapping("/details")
	public String details(){
		return "details";
	}
}
