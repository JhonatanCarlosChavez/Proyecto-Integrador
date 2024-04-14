package com.proyecto.prestamos.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.prestamos.entity.Grupo;
import com.proyecto.prestamos.entity.Rol;
//import com.proyecto.prestamos.entity.Enlace;
import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.services.GrupoServices;
import com.proyecto.prestamos.services.RolServices;
//import com.proyecto.prestamos.service.UsuarioService;
import com.proyecto.prestamos.services.UsuarioServices;

//atributos de tipo sesion
//@SessionAttributes({"ENLACES","CODIGOUSUARIO"})


//@CrossOrigin(origins = {"http://localhost:4200"})
//@RestController
@Controller
@RequestMapping("/sesion")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices servicioUsu;
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	/*//@RequestMapping("/intranet")
	public String intranet(Authentication auth,Model model) {
		//obtener nombre del rol del usuario que inicio sesiòn
		String nomRol=auth.getAuthorities().stream()
			      .map(GrantedAuthority::getAuthority)
			      .collect(Collectors.joining(","));
		
		//
		List<Enlace> lista=servicioUsu.enlaceDelUsuario(nomRol);
		Usuario u=servicioUsu.sesionUsuario(auth.getName());
		model.addAttribute("CODIGOUSUARIO",u.getCodigo());
		model.addAttribute("ENLACES", lista);
		return "intranet";
	} */

}

