/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "detallesventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallesventa.findAll", query = "SELECT d FROM Detallesventa d")
    , @NamedQuery(name = "Detallesventa.findByIdDetalle", query = "SELECT d FROM Detallesventa d WHERE d.idDetalle = :idDetalle")
    , @NamedQuery(name = "Detallesventa.findByCantidad", query = "SELECT d FROM Detallesventa d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "Detallesventa.findByIgv", query = "SELECT d FROM Detallesventa d WHERE d.igv = :igv")})
public class Detallesventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalle")
    private Integer idDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "igv")
    private int igv;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @JsonIgnore
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "idVenta", referencedColumnName = "idVenta")
    @ManyToOne(optional = false)
    private Ventas idVenta;

    public Detallesventa() {
    }

    public Detallesventa(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Detallesventa(Integer idDetalle, int cantidad, int igv) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.igv = igv;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Ventas getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Ventas idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallesventa)) {
            return false;
        }
        Detallesventa other = (Detallesventa) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Detallesventa[ idDetalle=" + idDetalle + " ]";
    }
    
}
