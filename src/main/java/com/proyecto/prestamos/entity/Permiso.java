package com.proyecto.prestamos.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="permiso")
public class Permiso {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idPermiso")
	private Integer codigo ;
	
	@Column(name="Nombre")
	private String descripcion;
	
	@OneToMany(mappedBy = "permiso")
	private List<RolPermiso> listaRolPermiso;

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

	public List<RolPermiso> getListaRolPermiso() {
		return listaRolPermiso;
	}

	public void setListaRolPermiso(List<RolPermiso> listaRolPermiso) {
		this.listaRolPermiso = listaRolPermiso;
	}
	
	
}
