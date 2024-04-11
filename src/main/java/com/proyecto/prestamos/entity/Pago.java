package com.proyecto.prestamos.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idPago")
	private Integer codigo ;
	
	@Column(name="MontoPago")
	private double montoPago;
	
	@Column(name="FechaPago")
	private Date fechaPago;
	
	@ManyToOne
	@JoinColumn(name="idPrestamo")
	private Prestamo pago;
	
	@ManyToOne
	@JoinColumn(name="idTipoPago")
	private TipoPago tipopago;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Prestamo getPago() {
		return pago;
	}

	public void setPago(Prestamo pago) {
		this.pago = pago;
	}

	public TipoPago getTipopago() {
		return tipopago;
	}

	public void setTipopago(TipoPago tipopago) {
		this.tipopago = tipopago;
	}
	
	
}
