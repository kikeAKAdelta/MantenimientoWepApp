package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DetalleOrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Estado;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Parte;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Responsable;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(MttoDetalle.class)
public class MttoDetalle_ { 

    public static volatile SingularAttribute<MttoDetalle, Estado> idEstado;
    public static volatile SingularAttribute<MttoDetalle, Integer> idMttoDetalle;
    public static volatile ListAttribute<MttoDetalle, DetalleOrdenTrabajo> detalleOrdenTrabajoList;
    public static volatile SingularAttribute<MttoDetalle, Responsable> idResponsable;
    public static volatile SingularAttribute<MttoDetalle, Parte> idParte;

}