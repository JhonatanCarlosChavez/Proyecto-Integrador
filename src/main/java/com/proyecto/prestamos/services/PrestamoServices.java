package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.prestamos.entity.Prestamo;
import com.proyecto.prestamos.repository.PrestamoRepository;

@Service
public class PrestamoServices {
	@Autowired
	private PrestamoRepository repo;
	
	public List<Prestamo> listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(Prestamo p) {
		repo.save(p);
	}
	
	public void actualizar(Prestamo p) {
		repo.save(p);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
}
