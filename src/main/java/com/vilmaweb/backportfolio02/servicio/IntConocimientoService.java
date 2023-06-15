
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Conocimiento;
import java.util.List;

/**
 *
 * @author Salvador Mauricio
 */
public interface IntConocimientoService {
    
    public List<Conocimiento> getConocimientos();
    public void saveConocimiento(Conocimiento conocimientoSaved);
    public void deleteConocimiento(Long id);
    public Conocimiento findConocimiento(Long id);
          
}
