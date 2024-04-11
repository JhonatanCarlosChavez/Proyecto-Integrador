package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.EstadoPrestamo;
import com.proyecto.prestamos.repository.EstadoPrestamoRepository;

@Service
public class EstadoPrestamoServices {
	@Autowired
	private EstadoPrestamoRepository repo;
	
	public List<EstadoPrestamo> listarTodos(){
		return repo.findAll();
	}
}
