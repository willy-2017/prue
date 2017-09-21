package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Paso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(TipoPaso.class)
public class TipoPaso_ { 

    public static volatile SingularAttribute<TipoPaso, Integer> idTipoPaso;
    public static volatile SingularAttribute<TipoPaso, String> descripcion;
    public static volatile CollectionAttribute<TipoPaso, Paso> pasoCollection;
    public static volatile SingularAttribute<TipoPaso, String> nombre;
    public static volatile SingularAttribute<TipoPaso, Boolean> activo;

}