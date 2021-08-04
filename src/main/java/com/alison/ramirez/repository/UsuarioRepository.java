package com.alison.ramirez.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.alison.ramirez.model.Usuario;

public interface UsuarioRepository extends JpaRepositoryImplementation<Usuario, Integer> {
	
	@Query(value="select count(*) from usuarios", nativeQuery = true)
	Integer totalEntidades();
	

}
