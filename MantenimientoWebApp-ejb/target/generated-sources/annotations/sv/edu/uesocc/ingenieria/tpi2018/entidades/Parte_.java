package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.DiagnosticoParte;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Equipo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Unidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-10T12:33:37")
@StaticMetamodel(Parte.class)
public class Parte_ { 

    public static volatile SingularAttribute<Parte, String> descripcion;
    public static volatile SingularAttribute<Parte, String> marca;
    public static volatile SingularAttribute<Parte, Equipo> idEquipo;
    public static volatile SingularAttribute<Parte, Integer> numeroInventario;
    public static volatile SingularAttribute<Parte, Unidad> idUnidad;
    public static volatile ListAttribute<Parte, DiagnosticoParte> diagnosticoParteList;
    public static volatile SingularAttribute<Parte, String> modelo;
    public static volatile ListAttribute<Parte, MttoDetalle> mttoDetalleList;
    public static volatile SingularAttribute<Parte, Integer> idParte;

}