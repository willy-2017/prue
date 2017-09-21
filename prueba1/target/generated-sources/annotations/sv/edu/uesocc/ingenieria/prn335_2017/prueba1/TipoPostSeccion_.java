package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Seccion;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPost;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPostSeccionPK;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(TipoPostSeccion.class)
public class TipoPostSeccion_ { 

    public static volatile SingularAttribute<TipoPostSeccion, TipoPostSeccionPK> tipoPostSeccionPK;
    public static volatile SingularAttribute<TipoPostSeccion, Seccion> seccion;
    public static volatile SingularAttribute<TipoPostSeccion, TipoPost> tipoPost;
    public static volatile SingularAttribute<TipoPostSeccion, Integer> peso;
    public static volatile SingularAttribute<TipoPostSeccion, Boolean> obligatorio;
    public static volatile SingularAttribute<TipoPostSeccion, Boolean> activo;

}