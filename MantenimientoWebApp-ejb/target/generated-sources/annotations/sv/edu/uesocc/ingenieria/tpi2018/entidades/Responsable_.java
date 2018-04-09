package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.MttoDetalle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(Responsable.class)
public class Responsable_ { 

    public static volatile SingularAttribute<Responsable, Boolean> docente;
    public static volatile SingularAttribute<Responsable, Integer> idResponsable;
    public static volatile ListAttribute<Responsable, MttoDetalle> mttoDetalleList;
    public static volatile SingularAttribute<Responsable, Integer> identificador;

}