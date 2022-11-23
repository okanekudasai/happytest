package com.ss.ss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	IdMapper mapper;
	
	@GetMapping(value="getting")
	public List<idDto> getting() {
		return mapper.getting();
	}
}