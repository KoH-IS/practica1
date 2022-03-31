package com.practica1.practica1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica1.practica1.entity.Integrante;
import com.practica1.practica1.repository.RepoIntegrante;

@Service
public class SvcIntegranteImp implements SvcIntegrante {
	
	@Autowired
	private RepoIntegrante repo;

	@Override
	public List<Integrante> getIntegrantes() throws Exception {
		return repo.findIntegrantes();
	}

	@Override
	public Integrante createIntegrante(String nombre) {
		Integrante integrante = new Integrante();
		integrante.setNombre(nombre);
		return repo.save(integrante);
	}
}