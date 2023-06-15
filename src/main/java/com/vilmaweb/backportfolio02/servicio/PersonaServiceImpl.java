
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Persona;
import com.vilmaweb.backportfolio02.repositorio.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salvador Mauricio
 */
@Service
public class PersonaServiceImpl implements IntPersonaService {
    
    @Autowired
    private PersonaRepository repoPersona;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = repoPersona.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona personaSaved) {
        repoPersona.save(personaSaved);
    }

    @Override
    public void deletePersona(Long idPersona) {
        repoPersona.deleteById(idPersona);
    }

    @Override
    public Persona findPersona(Long idPersona) {
        return repoPersona.findById(idPersona).orElse(null);
    }
    
}
