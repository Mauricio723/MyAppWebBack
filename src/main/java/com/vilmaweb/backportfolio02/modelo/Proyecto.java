
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
@Table(name="proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable=false)
    private Long id;
    
    @Column(length=100)
    private String nombre;
    
    @Column(length=200)
    private String descripcion;
    
    @Column(length=40)
    private String fechaPublicacion;
       
    //@ManyToOne(fetch= FetchType.LAZY)
    //@JoinColumn(name="persona_id")
    //@JsonIgnore
    //private Persona persona;
    
    /*
     @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;
    */

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String fechaPublicacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;        
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

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }   
        
}
