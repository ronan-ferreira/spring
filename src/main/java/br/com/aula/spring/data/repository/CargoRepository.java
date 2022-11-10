package br.com.aula.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.aula.spring.data.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer>{


}
