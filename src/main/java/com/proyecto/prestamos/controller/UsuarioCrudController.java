package com.proyecto.prestamos.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.proyecto.prestamos.entity.Grupo;
import com.proyecto.prestamos.entity.Rol;
import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.services.GrupoServices;
import com.proyecto.prestamos.services.RolServices;
import com.proyecto.prestamos.services.UsuarioServices;

@Controller
@RequestMapping("/usuario")
public class UsuarioCrudController {
	
	@Autowired
	private UsuarioServices servicioUsu;
	
	private GrupoServices servicioGrupo;
	
	private RolServices servicioRol;
	
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
	
	//Comentario
	
			
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
	
	
	
}
