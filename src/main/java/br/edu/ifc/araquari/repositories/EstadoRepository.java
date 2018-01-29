package br.edu.ifc.araquari.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifc.araquari.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}