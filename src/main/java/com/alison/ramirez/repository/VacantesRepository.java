package com.alison.ramirez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.alison.ramirez.model.Vacante;

public interface VacantesRepository extends JpaRepositoryImplementation<Vacante, Integer> {
	//*****************************
	List<Vacante> findByDestacadoAndEstatusOrderByIdDesc(Integer destacado,String estatus);
	
	//metodo que realiza una consulta con sql nativo
	@Query(value="SELECT * FROM vacantes WHERE destacado= 1\r\n"
			+ "AND estatus = 'Aprobada' ORDER BY id", nativeQuery = true)
	List<Vacante> obtenertodasDestacadas();
	
}
