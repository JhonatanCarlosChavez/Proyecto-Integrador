package com.proyecto.prestamos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.prestamos.entity.SolicitudPrestamo;

public interface SolicitudPrestamoRepository extends JpaRepository<SolicitudPrestamo, Integer>{

}
