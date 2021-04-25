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
@Table(name = "hoja_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HojaCliente.findAll", query = "SELECT h FROM HojaCliente h")
    , @NamedQuery(name = "HojaCliente.findById", query = "SELECT h FROM HojaCliente h WHERE h.id = :id")
    , @NamedQuery(name = "HojaCliente.findByNombre", query = "SELECT h FROM HojaCliente h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "HojaCliente.findByApellido", query = "SELECT h FROM HojaCliente h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "HojaCliente.findByTelefono", query = "SELECT h FROM HojaCliente h WHERE h.telefono = :telefono")
    , @NamedQuery(name = "HojaCliente.findByDireccion", query = "SELECT h FROM HojaCliente h WHERE h.direccion = :direccion")
    , @NamedQuery(name = "HojaCliente.findByProductoVendido", query = "SELECT h FROM HojaCliente h WHERE h.productoVendido = :productoVendido")
    , @NamedQuery(name = "HojaCliente.findByCantidad", query = "SELECT h FROM HojaCliente h WHERE h.cantidad = :cantidad")
    , @NamedQuery(name = "HojaCliente.findByEmail", query = "SELECT h FROM HojaCliente h WHERE h.email = :email")
    , @NamedQuery(name = "HojaCliente.findByValorUnit", query = "SELECT h FROM HojaCliente h WHERE h.valorUnit = :valorUnit")
    , @NamedQuery(name = "HojaCliente.findByFecha", query = "SELECT h FROM HojaCliente h WHERE h.fecha = :fecha")
    , @NamedQuery(name = "HojaCliente.findByTotal", query = "SELECT h FROM HojaCliente h WHERE h.total = :total")})
public class HojaCliente implements Serializable {

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
    @Size(max = 20)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "producto_vendido")
    private String productoVendido;
    @Size(max = 20)
    @Column(name = "cantidad")
    private String cantidad;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "email")
    private String email;
    @Size(max = 20)
    @Column(name = "valor_unit")
    private String valorUnit;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 20)
    @Column(name = "total")
    private String total;

    public HojaCliente() {
    }

    public HojaCliente(Integer id) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(String productoVendido) {
        this.productoVendido = productoVendido;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(String valorUnit) {
        this.valorUnit = valorUnit;
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
        if (!(object instanceof HojaCliente)) {
            return false;
        }
        HojaCliente other = (HojaCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HojaCliente[ id=" + id + " ]";
    }
    
}
