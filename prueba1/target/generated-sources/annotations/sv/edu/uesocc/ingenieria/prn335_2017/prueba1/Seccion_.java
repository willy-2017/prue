package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPostSeccion;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoSeccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, String> descripcion;
    public static volatile CollectionAttribute<Seccion, TipoPostSeccion> tipoPostSeccionCollection;
    public static volatile SingularAttribute<Seccion, TipoSeccion> idTipoSeccion;
    public static volatile SingularAttribute<Seccion, Integer> idSeccion;
    public static volatile SingularAttribute<Seccion, String> nombre;
    public static volatile SingularAttribute<Seccion, Boolean> activo;

}