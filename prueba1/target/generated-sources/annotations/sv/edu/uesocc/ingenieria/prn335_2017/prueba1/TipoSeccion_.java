package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Seccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(TipoSeccion.class)
public class TipoSeccion_ { 

    public static volatile SingularAttribute<TipoSeccion, String> descripcion;
    public static volatile SingularAttribute<TipoSeccion, Integer> idTipoSeccion;
    public static volatile SingularAttribute<TipoSeccion, String> nombre;
    public static volatile SingularAttribute<TipoSeccion, Boolean> activo;
    public static volatile CollectionAttribute<TipoSeccion, Seccion> seccionCollection;

}