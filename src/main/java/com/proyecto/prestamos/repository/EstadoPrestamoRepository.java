package com.proyecto.prestamos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.prestamos.entity.EstadoPrestamo;

public interface EstadoPrestamoRepository extends JpaRepository<EstadoPrestamo, Integer>{

}
