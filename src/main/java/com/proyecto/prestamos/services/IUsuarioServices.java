package com.proyecto.prestamos.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.proyecto.prestamos.entity.Usuario;

import java.util.List;

public interface IUsuarioServices {
	public List<Usuario> findAll();
	public Page<Usuario> findAll(Pageable pageable);
	public Usuario findById(Long id);
	public Usuario save (Usuario usuario);
	public void delete(Long id);
	
	
	
	
}
