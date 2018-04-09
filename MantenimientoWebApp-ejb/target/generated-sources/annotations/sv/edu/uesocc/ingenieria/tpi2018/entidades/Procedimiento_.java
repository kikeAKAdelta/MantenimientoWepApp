package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Diagnostico;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Estado;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Pasos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T21:03:07")
@StaticMetamodel(Procedimiento.class)
public class Procedimiento_ { 

    public static volatile SingularAttribute<Procedimiento, String> descripcion;
    public static volatile SingularAttribute<Procedimiento, Integer> idProcedimiento;
    public static volatile ListAttribute<Procedimiento, Pasos> pasosList;
    public static volatile ListAttribute<Procedimiento, Estado> estadoList;
    public static volatile SingularAttribute<Procedimiento, Diagnostico> idDiagnostico;

}