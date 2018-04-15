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
@Table(name = "procedimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimiento.findAll", query = "SELECT p FROM Procedimiento p")
    , @NamedQuery(name = "Procedimiento.findByIdProcedimiento", query = "SELECT p FROM Procedimiento p WHERE p.idProcedimiento = :idProcedimiento")
    , @NamedQuery(name = "Procedimiento.findByProcedimiento", query = "SELECT p FROM Procedimiento p WHERE p.procedimiento = :procedimiento")})
public class Procedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_procedimiento")
    private Integer idProcedimiento;
    @Size(max = 2147483647)
    @Column(name = "procedimiento")
    private String procedimiento;
    @JoinColumn(name = "id_pasos", referencedColumnName = "id_paso")
    @ManyToOne
    private Pasos idPasos;
    @OneToMany(mappedBy = "idProcedimiento")
    private List<Diagnostico> diagnosticoList;
    @OneToMany(mappedBy = "idProcedimiento")
    private List<EstadoDetalleMantenimiento> estadoDetalleMantenimientoList;

    public Procedimiento() {
    }

    public Procedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Integer getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Pasos getIdPasos() {
        return idPasos;
    }

    public void setIdPasos(Pasos idPasos) {
        this.idPasos = idPasos;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
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
        hash += (idProcedimiento != null ? idProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimiento)) {
            return false;
        }
        Procedimiento other = (Procedimiento) object;
        if ((this.idProcedimiento == null && other.idProcedimiento != null) || (this.idProcedimiento != null && !this.idProcedimiento.equals(other.idProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.Procedimiento[ idProcedimiento=" + idProcedimiento + " ]";
    }
    
}
