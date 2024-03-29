package com.yedam.java.chat.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.context.SecurityContextHolder;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class ChatController {
	
	@GetMapping("/chat")
	public void chat(Model model) {
		CustomUserVO user =(CustomUserVO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		log.info("==================================");
		log.info("@ChatController, GET Chat / Username : " + user.getUsername());

		model.addAttribute("userid", user.getUsername());
	}

}
