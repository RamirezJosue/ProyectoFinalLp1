/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Producto.findByUtilidad", query = "SELECT p FROM Producto p WHERE p.utilidad = :utilidad")
    , @NamedQuery(name = "Producto.findByUnidadKilo", query = "SELECT p FROM Producto p WHERE p.unidadKilo = :unidadKilo")
    , @NamedQuery(name = "Producto.findByEstado", query = "SELECT p FROM Producto p WHERE p.estado = :estado")
    , @NamedQuery(name = "Producto.findByCodigoDBarra", query = "SELECT p FROM Producto p WHERE p.codigoDBarra = :codigoDBarra")
    , @NamedQuery(name = "Producto.findByPrecioVenta", query = "SELECT p FROM Producto p WHERE p.precioVenta = :precioVenta")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "utilidad")
    private String utilidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "unidadKilo")
    private String unidadKilo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "codigoDBarra")
    private String codigoDBarra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioVenta")
    private int precioVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    @JsonIgnore
    private Collection<Detallesventa> detallesventaCollection;
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    @JsonIgnore
    private Collection<Almacen> almacenCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProducto")
    @JsonIgnore
    private Collection<Detallecompra> detallecompraCollection;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombre, String utilidad, String unidadKilo, String estado, String codigoDBarra, int precioVenta) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.utilidad = utilidad;
        this.unidadKilo = unidadKilo;
        this.estado = estado;
        this.codigoDBarra = codigoDBarra;
        this.precioVenta = precioVenta;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getUnidadKilo() {
        return unidadKilo;
    }

    public void setUnidadKilo(String unidadKilo) {
        this.unidadKilo = unidadKilo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoDBarra() {
        return codigoDBarra;
    }

    public void setCodigoDBarra(String codigoDBarra) {
        this.codigoDBarra = codigoDBarra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @XmlTransient
    public Collection<Detallesventa> getDetallesventaCollection() {
        return detallesventaCollection;
    }

    public void setDetallesventaCollection(Collection<Detallesventa> detallesventaCollection) {
        this.detallesventaCollection = detallesventaCollection;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    @XmlTransient
    public Collection<Almacen> getAlmacenCollection() {
        return almacenCollection;
    }

    public void setAlmacenCollection(Collection<Almacen> almacenCollection) {
        this.almacenCollection = almacenCollection;
    }

    @XmlTransient
    public Collection<Detallecompra> getDetallecompraCollection() {
        return detallecompraCollection;
    }

    public void setDetallecompraCollection(Collection<Detallecompra> detallecompraCollection) {
        this.detallecompraCollection = detallecompraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
