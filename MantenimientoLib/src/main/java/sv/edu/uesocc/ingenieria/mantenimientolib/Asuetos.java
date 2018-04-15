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
@Table(name = "asuetos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asuetos.findAll", query = "SELECT a FROM Asuetos a")
    , @NamedQuery(name = "Asuetos.findByIdAsueto", query = "SELECT a FROM Asuetos a WHERE a.idAsueto = :idAsueto")
    , @NamedQuery(name = "Asuetos.findByFecha", query = "SELECT a FROM Asuetos a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Asuetos.findByDescripcion", query = "SELECT a FROM Asuetos a WHERE a.descripcion = :descripcion")})
public class Asuetos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_asueto")
    private Integer idAsueto;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idAsuetos")
    private List<Calendario> calendarioList;

    public Asuetos() {
    }

    public Asuetos(Integer idAsueto) {
        this.idAsueto = idAsueto;
    }

    public Integer getIdAsueto() {
        return idAsueto;
    }

    public void setIdAsueto(Integer idAsueto) {
        this.idAsueto = idAsueto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Calendario> getCalendarioList() {
        return calendarioList;
    }

    public void setCalendarioList(List<Calendario> calendarioList) {
        this.calendarioList = calendarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsueto != null ? idAsueto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asuetos)) {
            return false;
        }
        Asuetos other = (Asuetos) object;
        if ((this.idAsueto == null && other.idAsueto != null) || (this.idAsueto != null && !this.idAsueto.equals(other.idAsueto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.Asuetos[ idAsueto=" + idAsueto + " ]";
    }
    
}
