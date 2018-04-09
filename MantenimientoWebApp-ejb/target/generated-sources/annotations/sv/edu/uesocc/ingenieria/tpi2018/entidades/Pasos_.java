package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.Procedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(Pasos.class)
public class Pasos_ { 

    public static volatile SingularAttribute<Pasos, String> descripcion;
    public static volatile SingularAttribute<Pasos, Integer> idPasos;
    public static volatile ListAttribute<Pasos, Procedimiento> procedimientoList;

}