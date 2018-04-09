package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(Calendario.class)
public class Calendario_ { 

    public static volatile SingularAttribute<Calendario, String> descripcion;
    public static volatile SingularAttribute<Calendario, Date> fecha;
    public static volatile ListAttribute<Calendario, OrdenTrabajo> ordenTrabajoList;
    public static volatile SingularAttribute<Calendario, Integer> idCalendario;

}