
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Proyecto;
import java.util.List;

/**
 *
 * @author Salvador Mauricio
 */
public interface IntProyectoService {
    
    public List<Proyecto> getProyectos();
    public void saveProyecto(Proyecto proyectoSaved);
    public void deleteProyecto(Long id);
    public Proyecto findProyecto(Long id);
            
}
