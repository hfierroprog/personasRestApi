package cl.hfierroprog.personas.rest.api.service;

import cl.hfierroprog.personas.rest.api.entity.DefaultResponse;
import cl.hfierroprog.personas.rest.api.entity.Persona;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    @Transactional
    DefaultResponse guardarPersona(Persona persona);

    @Transactional
    List<Persona> getPersona(Optional<Integer> id);

    @Transactional
    DefaultResponse updatePersona(Persona persona);

    @Transactional
    DefaultResponse deletePersona(Integer id);

}
