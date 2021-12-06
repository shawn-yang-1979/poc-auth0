package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
public class APIController {
	@GetMapping(value = "/users/current")
	public UserDto getCurrentUser(Principal p) {
		UserDto dto = new UserDto();
		dto.setName(p.getName());
		return dto;
	}

}
