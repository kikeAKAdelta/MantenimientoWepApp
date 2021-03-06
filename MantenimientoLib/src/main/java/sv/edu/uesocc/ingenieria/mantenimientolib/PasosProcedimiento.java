/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.mantenimientolib;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author degon
 */
@Entity
@Table(name = "pasos_procedimiento")
@XmlRootElement

public class PasosProcedimiento implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PasosProcedimientoPK pasosProcedimientoPK;
    
    @JoinColumn(name = "id_pasos", referencedColumnName = "id_pasos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pasos pasos;
    
    @JoinColumn(name = "id_procedimiento", referencedColumnName = "id_procedimiento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Integer procedimiento;

    public PasosProcedimiento(){}

    public PasosProcedimiento(Integer procedimiento) {
        this.procedimiento = procedimiento;
    }

    public PasosProcedimientoPK getPasosProcedimientoPK() {
        return pasosProcedimientoPK;
    }

    public void setPasosProcedimientoPK(PasosProcedimientoPK pasosProcedimientoPK) {
        this.pasosProcedimientoPK = pasosProcedimientoPK;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }

    public Integer getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Integer procedimiento) {
        this.procedimiento = procedimiento;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasosProcedimientoPK != null ? pasosProcedimientoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PasosProcedimiento)) {
            return false;
        }
        PasosProcedimiento other = (PasosProcedimiento) object;
        if ((this.pasosProcedimientoPK == null && other.pasosProcedimientoPK != null) || (this.pasosProcedimientoPK != null && !this.pasosProcedimientoPK.equals(other.pasosProcedimientoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mantenimiento.tpi.mantenimientolib.PasosProcedimiento[ pasosProcedimientoPK=" + pasosProcedimientoPK + " ]";
    }
}
