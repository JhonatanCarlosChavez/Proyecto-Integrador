package com.proyecto.prestamos.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="solicitud_prestamo")
public class SolicitudPrestamo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idSolicitudPrestamo")
	private Integer codigo ;
	
	@Column(name="MontoSolicitado")
	private Double montoSolicitado;
	
	@Column(name="FechaSolicitud")
	private Date fechaSolicitud;
	
	@Column(name="Estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario solicitud;
	
	@JsonIgnore
	@OneToMany(mappedBy = "solicitudprestamo")
	private List<Prestamo> listaPrestamo;
}
