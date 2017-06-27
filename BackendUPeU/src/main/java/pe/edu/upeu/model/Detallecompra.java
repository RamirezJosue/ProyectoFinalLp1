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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "detallecompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecompra.findAll", query = "SELECT d FROM Detallecompra d")
    , @NamedQuery(name = "Detallecompra.findByIdDetalleProducto", query = "SELECT d FROM Detallecompra d WHERE d.idDetalleProducto = :idDetalleProducto")
    , @NamedQuery(name = "Detallecompra.findByCantidad", query = "SELECT d FROM Detallecompra d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallecompra.findByPrecioCompra", query = "SELECT d FROM Detallecompra d WHERE d.precioCompra = :precioCompra")
    , @NamedQuery(name = "Detallecompra.findByTiempoDeEntrega", query = "SELECT d FROM Detallecompra d WHERE d.tiempoDeEntrega = :tiempoDeEntrega")})
public class Detallecompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleProducto")
    private Integer idDetalleProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioCompra")
    private int precioCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiempoDeEntrega")
    @Temporal(TemporalType.DATE)
    private Date tiempoDeEntrega;
    @JoinColumn(name = "idFactura", referencedColumnName = "idFactura")
    @ManyToOne(optional = false)
    private Facturadcompra idFactura;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto idProducto;

    public Detallecompra() {
    }

    public Detallecompra(Integer idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

    public Detallecompra(Integer idDetalleProducto, int cantidad, int precioCompra, Date tiempoDeEntrega) {
        this.idDetalleProducto = idDetalleProducto;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.tiempoDeEntrega = tiempoDeEntrega;
    }

    public Integer getIdDetalleProducto() {
        return idDetalleProducto;
    }

    public void setIdDetalleProducto(Integer idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Date getTiempoDeEntrega() {
        return tiempoDeEntrega;
    }

    public void setTiempoDeEntrega(Date tiempoDeEntrega) {
        this.tiempoDeEntrega = tiempoDeEntrega;
    }

    public Facturadcompra getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Facturadcompra idFactura) {
        this.idFactura = idFactura;
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
        hash += (idDetalleProducto != null ? idDetalleProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecompra)) {
            return false;
        }
        Detallecompra other = (Detallecompra) object;
        if ((this.idDetalleProducto == null && other.idDetalleProducto != null) || (this.idDetalleProducto != null && !this.idDetalleProducto.equals(other.idDetalleProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Detallecompra[ idDetalleProducto=" + idDetalleProducto + " ]";
    }
    
}
