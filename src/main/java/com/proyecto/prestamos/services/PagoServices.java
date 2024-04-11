package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.Pago;
import com.proyecto.prestamos.repository.PagoRepository;

@Service
public class PagoServices {
	@Autowired
	private PagoRepository repo;
	
	public List<Pago> listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(Pago p) {
		repo.save(p);
	}
	
	public void actualizar(Pago p) {
		repo.save(p);
	}
	
	public void eliminar(Integer cod) {
		repo.deleteById(cod);
	}
}
