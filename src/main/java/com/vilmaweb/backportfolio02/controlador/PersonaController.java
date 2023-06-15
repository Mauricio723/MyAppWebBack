
package com.vilmaweb.backportfolio02.controlador;

import com.vilmaweb.backportfolio02.modelo.Persona;
import com.vilmaweb.backportfolio02.servicio.IntPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Salvador Mauricio
 */
@RestController
@RequestMapping("api72/personas")
public class PersonaController {
    
    @Autowired
    private IntPersonaService servicioPersona;
    
    @GetMapping("/traertodas")
    public List<Persona> getPersonas(){
        return servicioPersona.getPersonas();
    }
    
    @GetMapping("/traer/{idpersona}") 
    public Persona traerPersonaById(@PathVariable Long idpersona) {
        return servicioPersona.findPersona(idpersona);
    }
    
    @PostMapping("/nueva")
    public void crearPersona(@RequestBody Persona nuevaPersona) {
        servicioPersona.savePersona(nuevaPersona);
    }
    
    @PutMapping("/modificar/{idpersona}")
    public void modificarPersona(@RequestBody Persona personaParaModificar, @PathVariable Long idpersona) {
        
        Persona personaModificada = servicioPersona.findPersona(idpersona);
        
        personaModificada.setNombre(personaParaModificar.getNombre());
        personaModificada.setApellido(personaParaModificar.getApellido());
        personaModificada.setOcupacion(personaParaModificar.getOcupacion());
        personaModificada.setTituloPrincipal(personaParaModificar.getTituloPrincipal());
        personaModificada.setFechaNacimiento(personaParaModificar.getFechaNacimiento());
        personaModificada.setEmail(personaParaModificar.getEmail());
        personaModificada.setAcercaDe(personaParaModificar.getAcercaDe());
        personaModificada.setUrlFoto(personaParaModificar.getUrlFoto());
        personaModificada.setUrlBanner(personaParaModificar.getUrlBanner());
        personaModificada.setCiudad(personaParaModificar.getCiudad());
        
        servicioPersona.savePersona(personaModificada);
    }
    
    @DeleteMapping("/eliminar/{idpersona}")
    public void eliminarPersona(@PathVariable Long idpersona) {
        servicioPersona.deletePersona(idpersona);
    }
    
}
