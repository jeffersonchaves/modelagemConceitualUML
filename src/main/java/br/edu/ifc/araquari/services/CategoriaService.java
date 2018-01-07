package br.edu.ifc.araquari.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifc.araquari.domain.Categoria;
import br.edu.ifc.araquari.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repository.findOne(id);
		return obj;
	}
	
}
