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
@Table(name = "solicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findByIdSolicitud", query = "SELECT s FROM Solicitud s WHERE s.idSolicitud = :idSolicitud")
    , @NamedQuery(name = "Solicitud.findByFecha", query = "SELECT s FROM Solicitud s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "Solicitud.findByResponsable", query = "SELECT s FROM Solicitud s WHERE s.responsable = :responsable")
    , @NamedQuery(name = "Solicitud.findByEmail", query = "SELECT s FROM Solicitud s WHERE s.email = :email")
    , @NamedQuery(name = "Solicitud.findByTelefono", query = "SELECT s FROM Solicitud s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "Solicitud.findByDescripcion", query = "SELECT s FROM Solicitud s WHERE s.descripcion = :descripcion")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_solicitud")
    private Integer idSolicitud;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 2147483647)
    @Column(name = "responsable")
    private String responsable;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Size(max = 2147483647)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idSolicitud")
    private List<OrdenTrabajo> ordenTrabajoList;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne
    private Equipo idEquipo;
    @JoinColumn(name = "id_tipo_mantenimiento", referencedColumnName = "id_tipo_mantenimiento")
    @ManyToOne
    private TipoMantenimiento idTipoMantenimiento;

    public Solicitud() {
    }

    public Solicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    public TipoMantenimiento getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(TipoMantenimiento idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.Solicitud[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
