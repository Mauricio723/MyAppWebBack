
package com.vilmaweb.backportfolio02.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author Salvador Mauricio
 */

@Entity
@Table(name="personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable=false)
    private Long id;
    
    @Column(length=50)
    private String nombre;
    
    @Column(length=50)
    private String apellido;
    
    @Column(length=60)
    private String ocupacion;
    
    @Column(length=70)
    private String tituloPrincipal;
    
    @Column(length=40)
    private String fechaNacimiento;
    
    @Column(length=120)
    private String email;
    
    @Column(length=300)
    private String acercaDe;
    
    @Column(length=170)
    private String urlFoto;
    
    @Column(length=170)
    private String urlBanner;
    
    @Column(length=100)
    private String ciudad;
    
    @OneToMany(mappedBy= "persona", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
    private List<Conocimiento> listaConocimientos;
    
    @OneToMany(mappedBy= "persona", fetch= FetchType.LAZY, cascade= CascadeType.ALL)
    private List<Proyecto> listaProyectos;
    /*
     @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Estudios> estudio;
    */
    /*
     @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estudio> listaEstudios;
    */

    public Persona(){        
    }
    
    public Persona(Long id, String nombre, String apellido, String ocupacion, 
            String tituloPrincipal, String fechaNacimiento, String email, 
            String acercaDe, String urlFoto, String urlBanner, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.tituloPrincipal = tituloPrincipal;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.acercaDe = acercaDe;
        this.urlFoto = urlFoto;
        this.urlBanner = urlBanner;
        this.ciudad = ciudad;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }         

    public List<Conocimiento> getListaConocimientos() {
        return listaConocimientos;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }
    
    
}
