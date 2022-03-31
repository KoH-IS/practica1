package com.practica1.practica1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "integrante")
public class Integrante {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_integrante")
	@JsonIgnore
	private Integer id_integrante;
	
	@NotNull
	@Column(name = "nombre")
	private String nombre;

	public Integrante() {
	}

	public Integer getId_integrante() {
		return id_integrante;
	}

	public void setId_integrante(Integer id_integrante) {
		this.id_integrante = id_integrante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Integrante [id_integrante=" + id_integrante + ", nombre=" + nombre + "]";
	}
}