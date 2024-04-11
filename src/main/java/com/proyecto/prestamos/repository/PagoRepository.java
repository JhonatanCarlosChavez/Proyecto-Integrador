package com.proyecto.prestamos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.prestamos.entity.Pago;

public interface PagoRepository extends JpaRepository<Pago, Integer> {

}
