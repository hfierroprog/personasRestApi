package cl.hfierroprog.personas.rest.api.service.impl;

import cl.hfierroprog.personas.rest.api.entity.DefaultResponse;
import cl.hfierroprog.personas.rest.api.entity.Persona;
import cl.hfierroprog.personas.rest.api.repository.PersonaDao;
import cl.hfierroprog.personas.rest.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    public DefaultResponse guardarPersona(Persona persona) {
        try{
            Persona personaDB = personaDao.save(persona);
            if(personaDB == null) {
                return new DefaultResponse(400, "Error al guardar persona", null);
            } else {
                return new DefaultResponse(200, "Persona Guardada con éxito!", personaDB);
            }
        } catch (Exception ex) {
            return new DefaultResponse(400, "Error al guardar persona", null);
        }
    }

    @Override
    public List<Persona> getPersona(Optional<Integer> id) {
        if(id.isPresent()) {
            Optional<Persona> personaResponse = personaDao.findById(id.get());

            if(personaResponse.isPresent()) {
                List<Persona> personaList = new ArrayList<>();

                personaList.add(personaResponse.get());

                return personaList;
            } else {
                return new ArrayList<>();
            }
        } else {
            return personaDao.findAll();

        }
    }

    @Override
    public DefaultResponse updatePersona(Persona persona) {
        Optional<Persona> personaDB = personaDao.findById(persona.getId());

        if(personaDB.isPresent()) {
            personaDao.save(persona);

            return new DefaultResponse(200, "Actualizado con éxito!", personaDB);
        } else {
            return new DefaultResponse(400, "El id no se encuentra en la base de datos!", null);
        }

    }

    @Override
    public DefaultResponse deletePersona(Integer id) {
        Optional<Persona> personaDB = personaDao.findById(id);

        if(personaDB.isPresent()) {
            personaDao.delete(personaDB.get());
            return new DefaultResponse(200, "Eliminado con éxito", personaDB);
        } else {
            return new DefaultResponse(400, "No se encuentra el id en la base de datos!", null);
        }

    }

}
