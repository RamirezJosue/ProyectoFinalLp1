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
@Table(name = "documentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d")
    , @NamedQuery(name = "Documentos.findByIdDocumento", query = "SELECT d FROM Documentos d WHERE d.idDocumento = :idDocumento")
    , @NamedQuery(name = "Documentos.findByBoleta", query = "SELECT d FROM Documentos d WHERE d.boleta = :boleta")
    , @NamedQuery(name = "Documentos.findByFactura", query = "SELECT d FROM Documentos d WHERE d.factura = :factura")
    , @NamedQuery(name = "Documentos.findByTicket", query = "SELECT d FROM Documentos d WHERE d.ticket = :ticket")})
public class Documentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDocumento")
    private Integer idDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "boleta")
    private String boleta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "factura")
    private String factura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ticket")
    private String ticket;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocumento")
    @JsonIgnore
    private Collection<Facturadcompra> facturadcompraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocumento")
    @JsonIgnore
    private Collection<Ventas> ventasCollection;

    public Documentos() {
    }

    public Documentos(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Documentos(Integer idDocumento, String boleta, String factura, String ticket) {
        this.idDocumento = idDocumento;
        this.boleta = boleta;
        this.factura = factura;
        this.ticket = ticket;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @XmlTransient
    public Collection<Facturadcompra> getFacturadcompraCollection() {
        return facturadcompraCollection;
    }

    public void setFacturadcompraCollection(Collection<Facturadcompra> facturadcompraCollection) {
        this.facturadcompraCollection = facturadcompraCollection;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumento != null ? idDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.model.Documentos[ idDocumento=" + idDocumento + " ]";
    }
    
}
