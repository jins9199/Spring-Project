package org.js.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@RequestMapping(value= {"/", "index.do"})
	public String getIndex() {
		
		log.info("###################################HOME");
		return "index";
	}

	
}
