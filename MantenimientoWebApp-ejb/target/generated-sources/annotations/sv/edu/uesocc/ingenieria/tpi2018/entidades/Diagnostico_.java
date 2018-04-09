package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DiagnosticoParte;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T21:03:07")
@StaticMetamodel(Diagnostico.class)
public class Diagnostico_ { 

    public static volatile SingularAttribute<Diagnostico, String> descripcion;
    public static volatile SingularAttribute<Diagnostico, Integer> idDiagnostico;
    public static volatile ListAttribute<Diagnostico, DiagnosticoParte> diagnosticoParteList;
    public static volatile ListAttribute<Diagnostico, Procedimiento> procedimientoList;

}