
package com.vilmaweb.backportfolio02.controlador;

import com.vilmaweb.backportfolio02.modelo.Conocimiento;
import com.vilmaweb.backportfolio02.servicio.IntConocimientoService;
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
@RequestMapping("api72/conocimientos")
public class ConocimientoController {
    
    @Autowired
    private IntConocimientoService servicioConocimiento;
    
    @Autowired
    private IntPersonaService servicioPersona;
    
    
    @GetMapping("/traertodos")
    public List<Conocimiento> traerConocimientos() {
        return servicioConocimiento.getConocimientos();
    }
    
    @GetMapping("/traer/{idconocimiento}")
    public Conocimiento traerConocimientoById(@PathVariable Long idconocimiento) {
        return servicioConocimiento.findConocimiento(idconocimiento);
    }
    
    @PostMapping("/nuevo/{id_persona}")
    public void crearConocimiento(@PathVariable Long id_persona, @RequestBody Conocimiento conocimientoNuevo) {
        
        servicioPersona.findPersona(id_persona).getListaConocimientos().add(conocimientoNuevo);
        servicioConocimiento.saveConocimiento(conocimientoNuevo);
    }
    
    @PutMapping("/modificar/{idconocimiento}")
    public void modificarConocimiento(@RequestBody Conocimiento conocimientoParaModificar, @PathVariable Long idconocimiento) {
        
        Conocimiento conocimientoModificado = servicioConocimiento.findConocimiento(idconocimiento);
        
        conocimientoModificado.setNombre(conocimientoParaModificar.getNombre());
        conocimientoModificado.setDescripcion(conocimientoParaModificar.getDescripcion());
        conocimientoModificado.setNivelAlcanzado(conocimientoParaModificar.getNivelAlcanzado());
        
        servicioConocimiento.saveConocimiento(conocimientoModificado);
    }   
    
    @DeleteMapping("/eliminar/{id}")
    public void eliminarConocimiento(@PathVariable Long id) {
        servicioConocimiento.deleteConocimiento(id);
    }   
    
}
