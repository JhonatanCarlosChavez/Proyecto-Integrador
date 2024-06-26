package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Permiso;
import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.repository.UsuarioRepository;



@Service
public class UsuarioServices  {
	@Autowired
	private UsuarioRepository repo;
	

	public List<Usuario> listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(Usuario u) {
		repo.save(u);
	}
	
	public void actualizar(Usuario u) {
		repo.save(u);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
	
	public Usuario buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	public Usuario sesionDelUsuario(String vLogin) {
		return repo.iniciarSesion(vLogin);
	}
	
	public List<Permiso> enlacesDelUsuario(String desRol){
		return repo.traerEnlacesDelUsuario(desRol);
	}

	
	
}
