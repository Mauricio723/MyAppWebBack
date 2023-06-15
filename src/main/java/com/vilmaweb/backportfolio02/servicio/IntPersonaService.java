
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Persona;
import java.util.List;

/**
 *
 * @author Salvador Mauricio
 */
public interface IntPersonaService {
    
    public List<Persona> getPersonas();
    public void savePersona(Persona personaSaved);
    public void deletePersona(Long idPersona);
    public Persona findPersona(Long idPersona);
    
}
