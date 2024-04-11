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
@Table(name="tipo_pago")
public class TipoPago {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idTipoPago")
	private Integer codigo ;
	
	@Column(name="Nombre")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipopago")
	private List<Pago> litaTipoPago;

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

	public List<Pago> getLitaTipoPago() {
		return litaTipoPago;
	}

	public void setLitaTipoPago(List<Pago> litaTipoPago) {
		this.litaTipoPago = litaTipoPago;
	}
	
	
}
