package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.prestamos.entity.SolicitudPrestamo;
import com.proyecto.prestamos.repository.SolicitudPrestamoRepository;

@Service
public class SolicitudPrestamoServices {
	@Autowired
	private SolicitudPrestamoRepository repo;
	
	public List<SolicitudPrestamo> listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(SolicitudPrestamo sp) {
		repo.save(sp);
	}
	
	public void actualizar(SolicitudPrestamo sp) {
		repo.save(sp);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
}
