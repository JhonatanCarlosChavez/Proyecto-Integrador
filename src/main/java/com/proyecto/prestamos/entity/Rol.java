package com.proyecto.prestamos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="rol")
public class Rol {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idRol")
	private Integer codigo ;
	private String nombre;
	@JsonIgnore
	@OneToMany(mappedBy = "rol")
	private List<Usuario> listaUsuario;
	@JsonIgnore
	@OneToMany(mappedBy = "rol")
	private List<RolPermiso> listaRolPermiso;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return nombre;
	}
	public void setDescripcion(String descripcion) {
		this.nombre = descripcion;
	}
	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}
	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	public List<RolPermiso> getListaRolPermiso() {
		return listaRolPermiso;
	}
	public void setListaRolPermiso(List<RolPermiso> listaRolPermiso) {
		this.listaRolPermiso = listaRolPermiso;
	}
	
	
}
