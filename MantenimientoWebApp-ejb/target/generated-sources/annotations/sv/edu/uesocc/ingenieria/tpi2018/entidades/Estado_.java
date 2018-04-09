package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, Integer> idEstado;
    public static volatile SingularAttribute<Estado, Procedimiento> idProcedimiento;
    public static volatile ListAttribute<Estado, DetalleOrdenTrabajo> detalleOrdenTrabajoList;
    public static volatile ListAttribute<Estado, MttoDetalle> mttoDetalleList;

}