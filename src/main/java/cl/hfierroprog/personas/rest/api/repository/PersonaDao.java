package cl.hfierroprog.personas.rest.api.repository;

import cl.hfierroprog.personas.rest.api.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaDao extends CrudRepository<Persona, Integer> {
    List<Persona> findAll();
}
