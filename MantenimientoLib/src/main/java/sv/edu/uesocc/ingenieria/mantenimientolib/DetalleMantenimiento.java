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
 * @author david
 */
@Entity
@Table(name = "detalle_mantenimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleMantenimiento.findAll", query = "SELECT d FROM DetalleMantenimiento d")
    , @NamedQuery(name = "DetalleMantenimiento.findByIdDetalleMantenimiento", query = "SELECT d FROM DetalleMantenimiento d WHERE d.idDetalleMantenimiento = :idDetalleMantenimiento")
    , @NamedQuery(name = "DetalleMantenimiento.findBySoftware", query = "SELECT d FROM DetalleMantenimiento d WHERE d.software = :software")
    , @NamedQuery(name = "DetalleMantenimiento.findByDetalleHarware", query = "SELECT d FROM DetalleMantenimiento d WHERE d.detalleHarware = :detalleHarware")
    , @NamedQuery(name = "DetalleMantenimiento.findByDetalleSoftware", query = "SELECT d FROM DetalleMantenimiento d WHERE d.detalleSoftware = :detalleSoftware")})
public class DetalleMantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_detalle_mantenimiento")
    private Integer idDetalleMantenimiento;
    @Size(max = 2147483647)
    @Column(name = "software")
    private String software;
    @Size(max = 2147483647)
    @Column(name = "detalle_harware")
    private String detalleHarware;
    @Size(max = 2147483647)
    @Column(name = "detalle_software")
    private String detalleSoftware;
    @JoinColumn(name = "id_orden_trabajo", referencedColumnName = "id_orden_trabajo")
    @ManyToOne
    private OrdenTrabajo idOrdenTrabajo;
    @OneToMany(mappedBy = "idDetalleMantenimiento")
    private List<EstadoDetalleMantenimiento> estadoDetalleMantenimientoList;

    public DetalleMantenimiento() {
    }

    public DetalleMantenimiento(Integer idDetalleMantenimiento) {
        this.idDetalleMantenimiento = idDetalleMantenimiento;
    }

    public Integer getIdDetalleMantenimiento() {
        return idDetalleMantenimiento;
    }

    public void setIdDetalleMantenimiento(Integer idDetalleMantenimiento) {
        this.idDetalleMantenimiento = idDetalleMantenimiento;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getDetalleHarware() {
        return detalleHarware;
    }

    public void setDetalleHarware(String detalleHarware) {
        this.detalleHarware = detalleHarware;
    }

    public String getDetalleSoftware() {
        return detalleSoftware;
    }

    public void setDetalleSoftware(String detalleSoftware) {
        this.detalleSoftware = detalleSoftware;
    }

    public OrdenTrabajo getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(OrdenTrabajo idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    @XmlTransient
    public List<EstadoDetalleMantenimiento> getEstadoDetalleMantenimientoList() {
        return estadoDetalleMantenimientoList;
    }

    public void setEstadoDetalleMantenimientoList(List<EstadoDetalleMantenimiento> estadoDetalleMantenimientoList) {
        this.estadoDetalleMantenimientoList = estadoDetalleMantenimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleMantenimiento != null ? idDetalleMantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleMantenimiento)) {
            return false;
        }
        DetalleMantenimiento other = (DetalleMantenimiento) object;
        if ((this.idDetalleMantenimiento == null && other.idDetalleMantenimiento != null) || (this.idDetalleMantenimiento != null && !this.idDetalleMantenimiento.equals(other.idDetalleMantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.DetalleMantenimiento[ idDetalleMantenimiento=" + idDetalleMantenimiento + " ]";
    }
    
}
