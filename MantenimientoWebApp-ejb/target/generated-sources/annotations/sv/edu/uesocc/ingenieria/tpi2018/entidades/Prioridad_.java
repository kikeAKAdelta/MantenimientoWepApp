package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T16:44:36")
@StaticMetamodel(Prioridad.class)
public class Prioridad_ { 

    public static volatile SingularAttribute<Prioridad, String> descripcion;
    public static volatile ListAttribute<Prioridad, OrdenTrabajo> ordenTrabajoList;
    public static volatile SingularAttribute<Prioridad, Integer> idPrioridad;

}