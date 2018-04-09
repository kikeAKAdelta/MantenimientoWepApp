package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Diagnostico;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DiagnosticoPartePK;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Parte;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(DiagnosticoParte.class)
public class DiagnosticoParte_ { 

    public static volatile SingularAttribute<DiagnosticoParte, String> descripcion;
    public static volatile SingularAttribute<DiagnosticoParte, Diagnostico> diagnostico;
    public static volatile SingularAttribute<DiagnosticoParte, Parte> parte;
    public static volatile SingularAttribute<DiagnosticoParte, DiagnosticoPartePK> diagnosticoPartePK;

}