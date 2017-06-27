/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "almacen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Almacen.findAll", query = "SELECT a FROM Almacen a")
    , @NamedQuery(name = "Almacen.findByIdALmacen", query = "SELECT a FROM Almacen a WHERE a.idALmacen = :idALmacen")
    , @NamedQuery(name = "Almacen.findByStockAsignado", query = "SELECT a FROM Almacen a WHERE a.stockAsignado = :stockAsignado")
    , @NamedQuery(name = "Almacen.findByFecha", query = "SELECT a FROM Almacen a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Almacen.findByImpuesto", query = "SELECT a FROM Almacen a WHERE a.impuesto = :impuesto")
    , @NamedQuery(name = "Almacen.findBySerie", query = "SELECT a FROM Almacen a WHERE a.serie = :serie")
    , @NamedQuery(name = "Almacen.findByNumero", query = "SELECT a FROM Almacen a WHERE a.numero = :numero")
    , @NamedQuery(name = "Almacen.findByEstado", query = "SELECT a FROM Almacen a WHERE a.estado = :estado")})
public class Almacen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idALmacen")
    private Integer idALmacen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "stockAsignado")
    private int stockAsignado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "impuesto")
    private int impuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "serie")
    private int serie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Almacen() {
    }

    public Almacen(Integer idALmacen) {
        this.idALmacen = idALmacen;
    }

    public Almacen(Integer idALmacen, int stockAsignado, Date fecha, int impuesto, int serie, int numero, String estado) {
        this.idALmacen = idALmacen;
        this.stockAsignado = stockAsignado;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.serie = serie;
        this.numero = numero;
        this.estado = estado;
    }

    public Integer getIdALmacen() {
        return idALmacen;
    }

    public void setIdALmacen(Integer idALmacen) {
        this.idALmacen = idALmacen;
    }

    public int getStockAsignado() {
        return stockAsignado;
    }

    public void setStockAsignado(int stockAsignado) {
        this.stockAsignado = stockAsignado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idALmacen != null ? idALmacen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Almacen)) {
            return false;
        }
        Almacen other = (Almacen) object;
        if ((this.idALmacen == null && other.idALmacen != null) || (this.idALmacen != null && !this.idALmacen.equals(other.idALmacen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Almacen[ idALmacen=" + idALmacen + " ]";
    }
    
}
