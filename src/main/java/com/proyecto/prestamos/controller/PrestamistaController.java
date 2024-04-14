package com.proyecto.prestamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prestamista")
public class PrestamistaController {
	@GetMapping
	public String aaaa() {
		return "prestamista";
	}
}
