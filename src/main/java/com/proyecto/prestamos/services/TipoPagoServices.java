package com.proyecto.prestamos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.prestamos.entity.TipoPago;
import com.proyecto.prestamos.repository.TipoPagoRepository;

@Service
public class TipoPagoServices {
	@Autowired
	private TipoPagoRepository repo;
	
	public List<TipoPago> listarTodos(){
		return repo.findAll();
	}
}
