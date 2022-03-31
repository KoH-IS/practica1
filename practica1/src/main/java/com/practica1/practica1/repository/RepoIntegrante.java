package com.practica1.practica1.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practica1.practica1.entity.Integrante;

@Repository
public interface RepoIntegrante extends JpaRepository<Integrante, Integer>{
	
	@Query(value = "SELECT * FROM integrante ORDER BY nombre ASC", nativeQuery = true)
	List<Integrante> findIntegrantes();
}