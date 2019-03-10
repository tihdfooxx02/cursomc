package com.tiago.cursomc.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.domain.Categoria;

@Repository
	public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
