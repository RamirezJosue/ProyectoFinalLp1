/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.model;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JOSUE
 */
@Entity
@Table(name = "facturadcompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturadcompra.findAll", query = "SELECT f FROM Facturadcompra f")
    , @NamedQuery(name = "Facturadcompra.findByIdFactura", query = "SELECT f FROM Facturadcompra f WHERE f.idFactura = :idFactura")
    , @NamedQuery(name = "Facturadcompra.findByFecha", query = "SELECT f FROM Facturadcompra f WHERE f.fecha = :fecha")})
public class Facturadcompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFactura")
    private Integer idFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    private int fecha;
    @JoinColumn(name = "idDocumento", referencedColumnName = "idDocumento")
    @ManyToOne(optional = false)
    private Documentos idDocumento;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "idProveedor", referencedColumnName = "idProveedor")
    @ManyToOne(optional = false)
    private Proveedor idProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFactura")
    private Collection<Detallecompra> detallecompraCollection;

    public Facturadcompra() {
    }

    public Facturadcompra(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Facturadcompra(Integer idFactura, int fecha) {
        this.idFactura = idFactura;
        this.fecha = fecha;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Documentos getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Documentos idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
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
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturadcompra)) {
            return false;
        }
        Facturadcompra other = (Facturadcompra) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Facturadcompra[ idFactura=" + idFactura + " ]";
    }
    
}
