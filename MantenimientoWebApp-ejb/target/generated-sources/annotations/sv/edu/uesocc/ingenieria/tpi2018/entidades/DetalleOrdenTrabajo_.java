package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Estado;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T16:20:24")
@StaticMetamodel(DetalleOrdenTrabajo.class)
public class DetalleOrdenTrabajo_ { 

    public static volatile SingularAttribute<DetalleOrdenTrabajo, Integer> idDetalleOrdenTrabajo;
    public static volatile SingularAttribute<DetalleOrdenTrabajo, OrdenTrabajo> idOrdenTrabajo;
    public static volatile SingularAttribute<DetalleOrdenTrabajo, MttoDetalle> idMttoDetalle;
    public static volatile ListAttribute<DetalleOrdenTrabajo, Estado> estadoList;

}