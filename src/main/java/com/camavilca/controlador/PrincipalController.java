package com.camavilca.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalController {

	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
}
