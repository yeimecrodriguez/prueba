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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ydds2
 */
@Entity
@Table(name = "ficha_trabajadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FichaTrabajadores.findAll", query = "SELECT f FROM FichaTrabajadores f")
    , @NamedQuery(name = "FichaTrabajadores.findById", query = "SELECT f FROM FichaTrabajadores f WHERE f.id = :id")
    , @NamedQuery(name = "FichaTrabajadores.findByNombre", query = "SELECT f FROM FichaTrabajadores f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "FichaTrabajadores.findByApellido", query = "SELECT f FROM FichaTrabajadores f WHERE f.apellido = :apellido")
    , @NamedQuery(name = "FichaTrabajadores.findByTelefono", query = "SELECT f FROM FichaTrabajadores f WHERE f.telefono = :telefono")
    , @NamedQuery(name = "FichaTrabajadores.findByEmail", query = "SELECT f FROM FichaTrabajadores f WHERE f.email = :email")
    , @NamedQuery(name = "FichaTrabajadores.findByTrabajoRealizado", query = "SELECT f FROM FichaTrabajadores f WHERE f.trabajoRealizado = :trabajoRealizado")
    , @NamedQuery(name = "FichaTrabajadores.findByHorasTraba", query = "SELECT f FROM FichaTrabajadores f WHERE f.horasTraba = :horasTraba")
    , @NamedQuery(name = "FichaTrabajadores.findByFecha", query = "SELECT f FROM FichaTrabajadores f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "FichaTrabajadores.findByTotal", query = "SELECT f FROM FichaTrabajadores f WHERE f.total = :total")})
public class FichaTrabajadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "trabajo_realizado")
    private String trabajoRealizado;
    @Size(max = 20)
    @Column(name = "horas_traba")
    private String horasTraba;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 20)
    @Column(name = "total")
    private String total;

    public FichaTrabajadores() {
    }

    public FichaTrabajadores(Integer id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrabajoRealizado() {
        return trabajoRealizado;
    }

    public void setTrabajoRealizado(String trabajoRealizado) {
        this.trabajoRealizado = trabajoRealizado;
    }

    public String getHorasTraba() {
        return horasTraba;
    }

    public void setHorasTraba(String horasTraba) {
        this.horasTraba = horasTraba;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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
        if (!(object instanceof FichaTrabajadores)) {
            return false;
        }
        FichaTrabajadores other = (FichaTrabajadores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FichaTrabajadores[ id=" + id + " ]";
    }
    
}
