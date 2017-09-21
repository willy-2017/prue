package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Paso;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Post;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.PostPasoPK;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(PostPaso.class)
public class PostPaso_ { 

    public static volatile SingularAttribute<PostPaso, PostPasoPK> postPasoPK;
    public static volatile SingularAttribute<PostPaso, Integer> idRol;
    public static volatile SingularAttribute<PostPaso, Post> post;
    public static volatile SingularAttribute<PostPaso, Integer> idUsuario;
    public static volatile SingularAttribute<PostPaso, Boolean> aprobado;
    public static volatile SingularAttribute<PostPaso, Paso> paso;
    public static volatile SingularAttribute<PostPaso, Integer> idCategoria;
    public static volatile SingularAttribute<PostPaso, String> comentarios;

}