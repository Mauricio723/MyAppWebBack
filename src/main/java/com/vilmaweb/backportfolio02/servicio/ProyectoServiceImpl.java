
package com.vilmaweb.backportfolio02.servicio;

import com.vilmaweb.backportfolio02.modelo.Proyecto;
import com.vilmaweb.backportfolio02.repositorio.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Salvador Mauricio
 */
@Service
public class ProyectoServiceImpl implements IntProyectoService {
    
    @Autowired
    private ProyectoRepository repoProyecto;

    @Override
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = repoProyecto.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyecto(Proyecto proyectoSaved) {
        repoProyecto.save(proyectoSaved);
    }

    @Override
    public void deleteProyecto(Long id) {
        repoProyecto.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyectoFind = repoProyecto.findById(id).orElse(null);
        return proyectoFind;
    }
    
}
