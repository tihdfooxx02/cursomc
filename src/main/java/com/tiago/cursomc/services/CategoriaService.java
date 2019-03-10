package com.tiago.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.cursomc.domain.Categoria;
import com.tiago.cursomc.repositores.CategoriaRepository;

@Service
	public class CategoriaService {
		
		@Autowired
		private CategoriaRepository repo;
	
		public Categoria buscar(Integer id) {
			Categoria obj = repo.findOne(id);
			return obj;
		}
}
