package cl.hfierroprog.personas.rest.api.controller;

import cl.hfierroprog.personas.rest.api.entity.DefaultResponse;
import cl.hfierroprog.personas.rest.api.entity.Persona;
import cl.hfierroprog.personas.rest.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/guardarPersona")
    public DefaultResponse guardarResponse(@RequestBody Persona persona) {
        return personaService.guardarPersona(persona);
    }

    @GetMapping("/getPersona")
    public List<Persona> getPersona(@RequestParam("id") Optional<Integer> id) {
        return personaService.getPersona(id);
    }

    @PutMapping("/updatePersona")
    public DefaultResponse updatePersona(@RequestBody Persona persona) {
        return personaService.updatePersona(persona);
    }

    @DeleteMapping("/deletePersona")
    public DefaultResponse deletePersona(@RequestParam("id") Integer id) {
        return personaService.deletePersona(id);
    }
}
