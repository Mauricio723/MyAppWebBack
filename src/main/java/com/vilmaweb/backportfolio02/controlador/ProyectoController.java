
package com.vilmaweb.backportfolio02.controlador;

import com.vilmaweb.backportfolio02.modelo.Proyecto;
import com.vilmaweb.backportfolio02.servicio.IntProyectoService;
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
@RequestMapping("api72/proyectos")
public class ProyectoController {
    
    @Autowired
    private IntProyectoService servicioProyecto;
    
    @GetMapping("/traertodos")
    public List<Proyecto> traerProyectos() {
        return servicioProyecto.getProyectos();
    }
    
    @GetMapping("/traer/{id}")
    public Proyecto traerProyectoById(@PathVariable Long id) {
        return servicioProyecto.findProyecto(id);
    }
    
    @PostMapping("/nuevo/{idpersona}")
    public void crearProyecto(@RequestBody Proyecto proyectoNuevo, @PathVariable Long idpersona) {
        servicioProyecto.saveProyecto(proyectoNuevo);
    }
    
    @PutMapping("/modificar/{id}")
    public void modificarProyecto(@RequestBody Proyecto proyectoParaModificar, @PathVariable Long id) {
        
        Proyecto proyectoModificado = servicioProyecto.findProyecto(id);
        
        proyectoModificado.setNombre(proyectoParaModificar.getNombre());
        proyectoModificado.setDescripcion(proyectoParaModificar.getDescripcion());
        proyectoModificado.setFechaPublicacion(proyectoParaModificar.getFechaPublicacion());
        
        servicioProyecto.saveProyecto(proyectoModificado);
        
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarProyecto(@PathVariable Long id) {
        servicioProyecto.deleteProyecto(id);
    }   
    
}
