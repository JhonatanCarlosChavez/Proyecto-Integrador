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


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/sesion")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices servicioUsu;
	
	private GrupoServices servicioGrupo;
	
	private RolServices servicioRol;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/grabar")
	public String grabar(@RequestParam("codigo")Integer cod,
			@RequestParam("nombre")String nom,
			@RequestParam("apellido")String ape,
			@RequestParam("dni")String dni,
			@RequestParam("correo")String corr,
			@RequestParam("telefono")String tel,
			@RequestParam("fec")String fec,
			@RequestParam("log")String log,
			@RequestParam("pass")String pas,
			@RequestParam("rol")Integer codl,
			@RequestParam("grupo")Integer codg,
			RedirectAttributes redirect) {
		
		try {
			
			Usuario usu = new Usuario();
			usu.setNombre(nom);
			usu.setApellido(ape);
			usu.setDni(dni);
			usu.setCorreo(corr);
			usu.setTelefono(tel);
			usu.setFecRegistro(LocalDate.parse(fec));
			usu.setLog(log);
			usu.setPass(pas);
			
			Rol rol=new Rol();
			rol.setCodigo(codl);
			
			Grupo gr=new Grupo();
			gr.setCodigo(codg);
			
			if(cod==0) {
				servicioUsu.registrar(usu);
				redirect.addFlashAttribute("MENSAJE","Usuario registrado");
			}
			else {
				usu.setCodigo(cod);
				servicioUsu.actualizar(usu);
				redirect.addFlashAttribute("MENSAJE","Usuario actualizado");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		return "redirect:/usuario/lista";
			
	}	
			
	@RequestMapping("/consultaPorID")
	@ResponseBody
	public Usuario consultaPorID(@RequestParam("codigo") Integer cod){
		return servicioUsu.buscarPorID(cod);
	}
	
	@RequestMapping("/eliminarPorID")
	public String eliminarPorID(@RequestParam("codigo") Integer cod,
								RedirectAttributes redirect) {
		servicioUsu.eliminar(cod);
		redirect.addFlashAttribute("MENSAJE","Usuario eliminado");
		return "redirect:/Usuario/lista";
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

