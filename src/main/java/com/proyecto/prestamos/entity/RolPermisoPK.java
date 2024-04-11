package com.proyecto.prestamos.entity;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class RolPermisoPK {
	private  int idRol;
	private  int idPermiso;
	
	@Override
	public int hashCode() {
		return Objects.hash(idPermiso, idRol);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolPermisoPK other = (RolPermisoPK) obj;
		return idPermiso == other.idPermiso && idRol == other.idRol;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public int getIdPermiso() {
		return idPermiso;
	}
	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}
	
	
}
