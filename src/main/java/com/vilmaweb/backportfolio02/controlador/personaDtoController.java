package com.vilmaweb.backportfolio02.controlador;

import com.vilmaweb.backportfolio02.dto.PersonaDto;
import com.vilmaweb.backportfolio02.modelo.Persona;
//import com.vilmaweb.backportfolio02.servicio.IntConocimientoService;
import com.vilmaweb.backportfolio02.servicio.IntPersonaService;
//import com.vilmaweb.backportfolio02.servicio.IntProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Salvador Mauricio
 */
@RestController
@RequestMapping("/api72/personasdto")
@CrossOrigin(origins = "http://localhost:4200")
public class personaDtoController {

    @Autowired
    private IntPersonaService servicioPersona;   
   
    //@Autowired
    //private IntConocimientoService servicioConocimiento;
    
    //@Autowired
    //private IntProyectoService servicioProyecto;
   

    @GetMapping("/traerdto/{idpersona}")
    @ResponseBody
    public PersonaDto traerPersonaDto(@PathVariable Long idpersona) {
        
        PersonaDto dtoPersona = new PersonaDto();
        
        Persona persona = servicioPersona.findPersona(idpersona);
        
        dtoPersona.setId_persona(persona.getId());       
        dtoPersona.setNombre(persona.getNombre());
        dtoPersona.setApellido(persona.getApellido());
        dtoPersona.setTituloPrincipal(persona.getTituloPrincipal());
        dtoPersona.setAcercaDe(persona.getAcercaDe());
        dtoPersona.setUrlFoto(persona.getUrlFoto());
        dtoPersona.setUrlBanner(persona.getUrlBanner());
                   
        return dtoPersona;
    }

}
