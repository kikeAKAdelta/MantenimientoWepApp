package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Calendario;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Prioridad;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Solicitud;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Tipomtto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T21:03:07")
@StaticMetamodel(OrdenTrabajo.class)
public class OrdenTrabajo_ { 

    public static volatile SingularAttribute<OrdenTrabajo, String> descripcion;
    public static volatile SingularAttribute<OrdenTrabajo, Integer> idOrdenTrabajo;
    public static volatile ListAttribute<OrdenTrabajo, DetalleOrdenTrabajo> detalleOrdenTrabajoList;
    public static volatile SingularAttribute<OrdenTrabajo, Prioridad> idPrioridad;
    public static volatile SingularAttribute<OrdenTrabajo, Solicitud> idSolicitud;
    public static volatile SingularAttribute<OrdenTrabajo, Tipomtto> idTipomtto;
    public static volatile SingularAttribute<OrdenTrabajo, Calendario> idCalendario;

}