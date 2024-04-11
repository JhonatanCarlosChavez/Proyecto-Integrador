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
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Integer codigo ;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellido")
	private String apellido;
	
	@Column(name="Dni")
	private String dni;
	
	@Column(name="Correo")
	private String correo;
	
	@Column(name="Telefono")
	private String telefono;
	
	@Column(name="FechaRegistro")
	private Date fecRegistro;
	
	@Column(name="Login")
	private String log;
	
	@Column(name="Password")
	private String pass;
	
	@ManyToOne
	@JoinColumn(name="idRol")
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name="idGrupo")
	private Grupo grupo;
	
	@JsonIgnore
	@OneToMany(mappedBy = "solicitud")
	private List<SolicitudPrestamo> listaSolicitudPrestamo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<SolicitudPrestamo> getListaSolicitudPrestamo() {
		return listaSolicitudPrestamo;
	}

	public void setListaSolicitudPrestamo(List<SolicitudPrestamo> listaSolicitudPrestamo) {
		this.listaSolicitudPrestamo = listaSolicitudPrestamo;
	}
	
	
}
