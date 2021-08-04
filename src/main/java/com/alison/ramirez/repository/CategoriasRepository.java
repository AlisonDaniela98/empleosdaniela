package com.alison.ramirez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alison.ramirez.model.Categoria;


public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
