package br.org.generation.projetointegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.projetointegrador.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List <Tema> findAllByTemaContainingIgnoreCase(String tema);
}
