
package com.vilmaweb.backportfolio02.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Salvador Mauricio
 */
@Entity
@Table(name="conocimientos")
public class Conocimiento {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable=false)
    private Long id;
    
    @Column(length=60)
    private String nombre;
    
    @Column(length=200)
    private String descripcion;
    
    @Column(length=20)
    private String nivelAlcanzado;
       
    //@ManyToOne(fetch= FetchType.LAZY)
    //@JoinColumn(name="persona_id")
    //@JsonIgnore
    //private Persona persona;
    
    public Conocimiento() {
    }

    public Conocimiento(Long id, String nombre, String descripcion, String nivelAlcanzado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelAlcanzado = nivelAlcanzado;        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelAlcanzado() {
        return nivelAlcanzado;
    }

    public void setNivelAlcanzado(String nivelAlcanzado) {
        this.nivelAlcanzado = nivelAlcanzado;
    }
      
}
