/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author degon
 */
@Entity
@Table(name = "detalle_orden_trabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenTrabajo.findAll", query = "SELECT d FROM DetalleOrdenTrabajo d")
    , @NamedQuery(name = "DetalleOrdenTrabajo.findByIdDetalleOrdenTrabajo", query = "SELECT d FROM DetalleOrdenTrabajo d WHERE d.idDetalleOrdenTrabajo = :idDetalleOrdenTrabajo")})

public class DetalleOrdenTrabajo implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_orden_trabajo")
    private Integer idDetalleOrdenTrabajo;
    @JoinTable(name = "estado_detalle_orden_trabajo", joinColumns = {
        @JoinColumn(name = "id_detalle_orden_trabajo", referencedColumnName = "id_detalle_orden_trabajo")}, inverseJoinColumns = {
        @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")})
    @ManyToMany
    private List<Estado> estadoList;
    @JoinColumn(name = "id_mtto_detalle", referencedColumnName = "id_mtto_detalle")
    @ManyToOne
    private MttoDetalle idMttoDetalle;
    @JoinColumn(name = "id_orden_trabajo", referencedColumnName = "id_orden_trabajo")
    @ManyToOne
    private OrdenTrabajo idOrdenTrabajo;

    public DetalleOrdenTrabajo() {
    }

    public DetalleOrdenTrabajo(Integer idDetalleOrdenTrabajo) {
        this.idDetalleOrdenTrabajo = idDetalleOrdenTrabajo;
    }

    public Integer getIdDetalleOrdenTrabajo() {
        return idDetalleOrdenTrabajo;
    }

    public void setIdDetalleOrdenTrabajo(Integer idDetalleOrdenTrabajo) {
        this.idDetalleOrdenTrabajo = idDetalleOrdenTrabajo;
    }

    @XmlTransient
    public List<Estado> getEstadoList() {
        return estadoList;
    }

    public void setEstadoList(List<Estado> estadoList) {
        this.estadoList = estadoList;
    }

    public MttoDetalle getIdMttoDetalle() {
        return idMttoDetalle;
    }

    public void setIdMttoDetalle(MttoDetalle idMttoDetalle) {
        this.idMttoDetalle = idMttoDetalle;
    }

    public OrdenTrabajo getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(OrdenTrabajo idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleOrdenTrabajo != null ? idDetalleOrdenTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenTrabajo)) {
            return false;
        }
        DetalleOrdenTrabajo other = (DetalleOrdenTrabajo) object;
        if ((this.idDetalleOrdenTrabajo == null && other.idDetalleOrdenTrabajo != null) || (this.idDetalleOrdenTrabajo != null && !this.idDetalleOrdenTrabajo.equals(other.idDetalleOrdenTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mantenimiento.tpi.mantenimientolib.DetalleOrdenTrabajo[ idDetalleOrdenTrabajo=" + idDetalleOrdenTrabajo + " ]";
    }
    
}
