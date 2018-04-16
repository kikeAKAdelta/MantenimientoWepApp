/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.mantenimientolib;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "calendario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendario.findAll", query = "SELECT c FROM Calendario c")
    , @NamedQuery(name = "Calendario.findByIdCalendario", query = "SELECT c FROM Calendario c WHERE c.idCalendario = :idCalendario")
    , @NamedQuery(name = "Calendario.findByFechaInicio", query = "SELECT c FROM Calendario c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Calendario.findByDecripcion", query = "SELECT c FROM Calendario c WHERE c.decripcion = :decripcion")
    , @NamedQuery(name = "Calendario.findByResponsable", query = "SELECT c FROM Calendario c WHERE c.responsable = :responsable")
    , @NamedQuery(name = "Calendario.findByTelefono", query = "SELECT c FROM Calendario c WHERE c.telefono = :telefono")
    , @NamedQuery(name = "Calendario.findByFechaFin", query = "SELECT c FROM Calendario c WHERE c.fechaFin = :fechaFin")
    , @NamedQuery(name = "Calendario.findByCantidad", query = "SELECT c FROM Calendario c WHERE c.cantidad = :cantidad")})
public class Calendario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_calendario")
    private Integer idCalendario;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Size(max = 2147483647)
    @Column(name = "decripcion")
    private String decripcion;
    @Size(max = 2147483647)
    @Column(name = "responsable")
    private String responsable;
    @Size(max = 2147483647)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "cantidad")
    private Integer cantidad;
    @OneToMany(mappedBy = "idCalendario")
    private List<OrdenTrabajo> ordenTrabajoList;
    @JoinColumn(name = "id_asuetos", referencedColumnName = "id_asueto")
    @ManyToOne
    private Asuetos idAsuetos;

    public Calendario() {
    }

    public Calendario(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Integer getIdCalendario() {
        return idCalendario;
    }

    public void setIdCalendario(Integer idCalendario) {
        this.idCalendario = idCalendario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @XmlTransient
    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    public Asuetos getIdAsuetos() {
        return idAsuetos;
    }

    public void setIdAsuetos(Asuetos idAsuetos) {
        this.idAsuetos = idAsuetos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalendario != null ? idCalendario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendario)) {
            return false;
        }
        Calendario other = (Calendario) object;
        if ((this.idCalendario == null && other.idCalendario != null) || (this.idCalendario != null && !this.idCalendario.equals(other.idCalendario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.Calendario[ idCalendario=" + idCalendario + " ]";
    }
    
}