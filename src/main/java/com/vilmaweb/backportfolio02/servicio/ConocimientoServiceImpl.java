
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Conocimiento;
import com.vilmaweb.backportfolio02.repositorio.ConocimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salvador Mauricio
 */
@Service
public class ConocimientoServiceImpl implements IntConocimientoService {
    
    @Autowired
    private ConocimientoRepository repoConocimiento;

    @Override
    public List<Conocimiento> getConocimientos() {
        List<Conocimiento> listaConocimientos = repoConocimiento.findAll();
        return listaConocimientos;
    }

    @Override
    public void saveConocimiento(Conocimiento conocimientoSaved) {
        repoConocimiento.save(conocimientoSaved);
    }

    @Override
    public void deleteConocimiento(Long id) {
        repoConocimiento.deleteById(id);
    }

    @Override
    public Conocimiento findConocimiento(Long id) {
        Conocimiento conocimientoFind = repoConocimiento.findById(id).orElse(null);
        return conocimientoFind;
    }
    
}
