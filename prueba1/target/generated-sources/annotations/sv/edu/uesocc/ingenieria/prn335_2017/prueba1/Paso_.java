package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.PostPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.RolCategoria;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPaso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(Paso.class)
public class Paso_ { 

    public static volatile SingularAttribute<Paso, TipoPaso> idTipoPaso;
    public static volatile SingularAttribute<Paso, RolCategoria> rolCategoria;
    public static volatile CollectionAttribute<Paso, PostPaso> postPasoCollection;
    public static volatile SingularAttribute<Paso, Integer> idPaso;
    public static volatile SingularAttribute<Paso, String> nombre;
    public static volatile SingularAttribute<Paso, String> comentarios;

}