package com.proyecto.prestamos.entity;

import jakarta.persistence.*;
@Entity
@Table(name="permisos_roles")
public class RolPermiso {
	@EmbeddedId
	private RolPermisoPK pk;
	
	@ManyToOne
	@JoinColumn(name = "idRol",insertable = false,updatable = false,referencedColumnName ="idRol")
	private Rol rol;

	@ManyToOne
	@JoinColumn(name="idPermiso",insertable = false,updatable = false,referencedColumnName = "idPermiso")
	private Permiso permiso;

	public RolPermisoPK getPk() {
		return pk;
	}

	public void setPk(RolPermisoPK pk) {
		this.pk = pk;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Permiso getPermiso() {
		return permiso;
	}

	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	
	
	
}
