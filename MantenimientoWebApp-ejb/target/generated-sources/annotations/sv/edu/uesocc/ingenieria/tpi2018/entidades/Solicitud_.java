package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Unidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T12:33:37")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, String> descripcion;
    public static volatile SingularAttribute<Solicitud, Date> fecha;
    public static volatile SingularAttribute<Solicitud, String> solicitante;
    public static volatile ListAttribute<Solicitud, OrdenTrabajo> ordenTrabajoList;
    public static volatile SingularAttribute<Solicitud, Unidad> idUnidad;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;

}