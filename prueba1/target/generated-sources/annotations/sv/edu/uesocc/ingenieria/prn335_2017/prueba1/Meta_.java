package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Post;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(Meta.class)
public class Meta_ { 

    public static volatile SingularAttribute<Meta, String> descripcion;
    public static volatile SingularAttribute<Meta, Integer> idMeta;
    public static volatile CollectionAttribute<Meta, Post> postCollection;
    public static volatile SingularAttribute<Meta, String> nombre;
    public static volatile SingularAttribute<Meta, Boolean> activo;

}