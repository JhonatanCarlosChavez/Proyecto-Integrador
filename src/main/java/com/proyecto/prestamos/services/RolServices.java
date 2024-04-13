package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Rol;
import com.proyecto.prestamos.repository.RolRepository;

@Service
public class RolServices {
	
	@Autowired
	private RolRepository repo;
	
	public List<Rol> listarTodos(){
		return repo.findAll();
	}
}
