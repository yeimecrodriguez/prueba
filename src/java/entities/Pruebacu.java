/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ydds2
 */
@Entity
@Table(name = "pruebacu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pruebacu.findAll", query = "SELECT p FROM Pruebacu p")
    , @NamedQuery(name = "Pruebacu.findById", query = "SELECT p FROM Pruebacu p WHERE p.id = :id")
    , @NamedQuery(name = "Pruebacu.findByNombre", query = "SELECT p FROM Pruebacu p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Pruebacu.findByApodo", query = "SELECT p FROM Pruebacu p WHERE p.apodo = :apodo")
    , @NamedQuery(name = "Pruebacu.findByEdad", query = "SELECT p FROM Pruebacu p WHERE p.edad = :edad")})
public class Pruebacu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "apodo")
    private String apodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;

    public Pruebacu() {
    }

    public Pruebacu(Integer id) {
        this.id = id;
    }

    public Pruebacu(Integer id, String nombre, String apodo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pruebacu)) {
            return false;
        }
        Pruebacu other = (Pruebacu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pruebacu[ id=" + id + " ]";
    }
    
}
