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
@Table(name = "diagnostico_parte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiagnosticoParte.findAll", query = "SELECT d FROM DiagnosticoParte d")
    , @NamedQuery(name = "DiagnosticoParte.findByIdDiagnosticoParte", query = "SELECT d FROM DiagnosticoParte d WHERE d.idDiagnosticoParte = :idDiagnosticoParte")
    , @NamedQuery(name = "DiagnosticoParte.findByParte", query = "SELECT d FROM DiagnosticoParte d WHERE d.parte = :parte")
    , @NamedQuery(name = "DiagnosticoParte.findByObservaciones", query = "SELECT d FROM DiagnosticoParte d WHERE d.observaciones = :observaciones")})
public class DiagnosticoParte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_diagnostico_parte")
    private Integer idDiagnosticoParte;
    @Size(max = 2147483647)
    @Column(name = "parte")
    private String parte;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "idDiagnosticoParte")
    private List<Diagnostico> diagnosticoList;

    public DiagnosticoParte() {
    }

    public DiagnosticoParte(Integer idDiagnosticoParte) {
        this.idDiagnosticoParte = idDiagnosticoParte;
    }

    public Integer getIdDiagnosticoParte() {
        return idDiagnosticoParte;
    }

    public void setIdDiagnosticoParte(Integer idDiagnosticoParte) {
        this.idDiagnosticoParte = idDiagnosticoParte;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnosticoParte != null ? idDiagnosticoParte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticoParte)) {
            return false;
        }
        DiagnosticoParte other = (DiagnosticoParte) object;
        if ((this.idDiagnosticoParte == null && other.idDiagnosticoParte != null) || (this.idDiagnosticoParte != null && !this.idDiagnosticoParte.equals(other.idDiagnosticoParte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sv.edu.uesocc.ingenieria.mantenimientolib.DiagnosticoParte[ idDiagnosticoParte=" + idDiagnosticoParte + " ]";
    }
    
}
