package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Categoria;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Cometario;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Meta;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.PostPaso;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.PostSeccion;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.TipoPost;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> descripcion;
    public static volatile SingularAttribute<Post, Date> fecha;
    public static volatile SingularAttribute<Post, TipoPost> idTipoPost;
    public static volatile CollectionAttribute<Post, PostPaso> postPasoCollection;
    public static volatile CollectionAttribute<Post, Cometario> cometarioCollection;
    public static volatile SingularAttribute<Post, String> titulo;
    public static volatile SingularAttribute<Post, Boolean> aprobacionComentarios;
    public static volatile SingularAttribute<Post, Categoria> idCategoria;
    public static volatile CollectionAttribute<Post, Meta> metaCollection;
    public static volatile SingularAttribute<Post, Integer> idPost;
    public static volatile CollectionAttribute<Post, PostSeccion> postSeccionCollection;

}