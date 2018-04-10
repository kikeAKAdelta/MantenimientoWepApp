package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Parte;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Solicitud;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T16:20:24")
@StaticMetamodel(Unidad.class)
public class Unidad_ { 

    public static volatile SingularAttribute<Unidad, Integer> idUnidad;
    public static volatile ListAttribute<Unidad, Equipo> equipoList;
    public static volatile SingularAttribute<Unidad, String> nombreUnidad;
    public static volatile ListAttribute<Unidad, Solicitud> solicitudList;
    public static volatile ListAttribute<Unidad, Parte> parteList;

}