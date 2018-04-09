package sv.edu.uesocc.ingenieria.tpi2018.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.OrdenTrabajo;
import sv.edu.uesocc.ingenieria.tpi2018.entidades.SubtipoMtto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-08T22:59:46")
@StaticMetamodel(Tipomtto.class)
public class Tipomtto_ { 

    public static volatile SingularAttribute<Tipomtto, String> descripcion;
    public static volatile ListAttribute<Tipomtto, SubtipoMtto> subtipoMttoList;
    public static volatile ListAttribute<Tipomtto, OrdenTrabajo> ordenTrabajoList;
    public static volatile SingularAttribute<Tipomtto, Integer> idTipomtto;

}