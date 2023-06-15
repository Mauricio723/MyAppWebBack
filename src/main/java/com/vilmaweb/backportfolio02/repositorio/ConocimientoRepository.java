
package com.vilmaweb.backportfolio02.repositorio;

import com.vilmaweb.backportfolio02.modelo.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Salvador Mauricio
 */
@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long> {
    
}
