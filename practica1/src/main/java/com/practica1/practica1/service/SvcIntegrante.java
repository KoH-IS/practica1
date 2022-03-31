package com.practica1.practica1.service;

import java.util.List;

import com.practica1.practica1.entity.Integrante;

public interface SvcIntegrante {
	
	List<Integrante> getIntegrantes() throws Exception;
	Integrante createIntegrante(String nombre);
}