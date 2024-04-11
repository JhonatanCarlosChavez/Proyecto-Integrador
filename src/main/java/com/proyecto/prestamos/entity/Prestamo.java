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
@Table(name="prestamo")
public class Prestamo {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idPrestamo")
	private Integer codigo;
	
	@Column(name="MontoPrestamo")
	private double montoPrestamo;
	
	@Column(name="TasaInteres")
	private double tasaInteres;
	
	@Column(name="FechaInicio")
	private Date fechaInicio;
	
	@Column(name="FechaVencimiento")
	private Date fechaVencimiento;
	
	@ManyToOne
	@JoinColumn(name="idSolicitudPrestamos")
	private SolicitudPrestamo solicitudprestamo;
	
	@ManyToOne
	@JoinColumn(name="idEstadoPrestamo")
	private EstadoPrestamo estado;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pago")
	private List<Pago> listaPago;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getMontoPrestamo() {
		return montoPrestamo;
	}

	public void setMontoPrestamo(double montoPrestamo) {
		this.montoPrestamo = montoPrestamo;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public SolicitudPrestamo getSolicitudprestamo() {
		return solicitudprestamo;
	}

	public void setSolicitudprestamo(SolicitudPrestamo solicitudprestamo) {
		this.solicitudprestamo = solicitudprestamo;
	}

	public EstadoPrestamo getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrestamo estado) {
		this.estado = estado;
	}

	public List<Pago> getListaPago() {
		return listaPago;
	}

	public void setListaPago(List<Pago> listaPago) {
		this.listaPago = listaPago;
	}
	
	
}
