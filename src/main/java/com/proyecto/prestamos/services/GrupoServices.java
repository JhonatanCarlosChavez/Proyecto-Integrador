package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Grupo;
import com.proyecto.prestamos.repository.GrupoRepository;

@Service
public class GrupoServices {
	@Autowired
	private GrupoRepository repo;
	
	public List<Grupo> listarTodos(){
		return repo.findAll();
	}
}
