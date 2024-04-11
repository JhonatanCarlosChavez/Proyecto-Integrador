package com.proyecto.prestamos.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="estado_prestamo")
public class EstadoPrestamo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idEstadoPrestamo")
	private Integer codigo;
	
	@Column(name="Nombre")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estado")
	private List<Prestamo> listaEstadoPrestamo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Prestamo> getListaEstadoPrestamo() {
		return listaEstadoPrestamo;
	}

	public void setListaEstadoPrestamo(List<Prestamo> listaEstadoPrestamo) {
		this.listaEstadoPrestamo = listaEstadoPrestamo;
	}
	
	
}
