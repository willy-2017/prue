package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Post;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPostSeccion;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(TipoPost.class)
public class TipoPost_ { 

    public static volatile SingularAttribute<TipoPost, String> descripcion;
    public static volatile CollectionAttribute<TipoPost, TipoPostSeccion> tipoPostSeccionCollection;
    public static volatile SingularAttribute<TipoPost, Integer> idTipoPost;
    public static volatile CollectionAttribute<TipoPost, Post> postCollection;
    public static volatile SingularAttribute<TipoPost, String> nombre;
    public static volatile SingularAttribute<TipoPost, Boolean> activo;

}