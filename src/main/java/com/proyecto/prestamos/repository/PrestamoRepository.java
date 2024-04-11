package com.proyecto.prestamos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.prestamos.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer>{

}
