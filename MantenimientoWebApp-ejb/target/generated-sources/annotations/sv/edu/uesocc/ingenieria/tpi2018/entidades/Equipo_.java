package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Parte;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Unidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T12:33:37")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, String> descripcion;
    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile SingularAttribute<Equipo, Integer> numeroInventario;
    public static volatile SingularAttribute<Equipo, Unidad> idUnidad;
    public static volatile ListAttribute<Equipo, Parte> parteList;

}