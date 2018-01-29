package br.edu.ifc.araquari.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifc.araquari.domain.Cliente;
import br.edu.ifc.araquari.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repository.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. id: "+ id);
		}
		return obj;
	}
}
