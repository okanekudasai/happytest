package com.ss.ss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MainController {
	@Autowired
	IdMapper mapper;
	
	@GetMapping(value="getting")
	public List<idDto> getting() {
		List<idDto> list = mapper.getting();
		System.out.println(list);
		return list;
	}
}
