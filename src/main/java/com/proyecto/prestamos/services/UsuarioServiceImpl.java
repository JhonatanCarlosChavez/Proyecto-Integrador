package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Usuario;
import com.proyecto.prestamos.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioServices {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public List<Usuario> listarTodos() {
		return repository.findAll();
		
		
	}

}
