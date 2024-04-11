package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.repository.UsuarioRepository;

@Service
public class UsuarioServices {
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
}
