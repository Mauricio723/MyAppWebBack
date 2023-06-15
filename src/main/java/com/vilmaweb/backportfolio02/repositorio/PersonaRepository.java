
package com.vilmaweb.backportfolio02.repositorio;

import com.vilmaweb.backportfolio02.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salvador Mauricio
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
