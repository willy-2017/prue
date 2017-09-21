package sv.edu.uesocc.ingenieria.prn335_2017.prueba1;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Categoria;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Paso;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.Rol;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.RolCategoriaPK;
import sv.edu.uesocc.ingenieria.prn335_2017.prueba1.UsuarioRolCategoria;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-09-21T05:51:31")
@StaticMetamodel(RolCategoria.class)
public class RolCategoria_ { 

    public static volatile SingularAttribute<RolCategoria, Categoria> categoria;
    public static volatile CollectionAttribute<RolCategoria, Paso> pasoCollection;
    public static volatile SingularAttribute<RolCategoria, Rol> rol;
    public static volatile SingularAttribute<RolCategoria, RolCategoriaPK> rolCategoriaPK;
    public static volatile SingularAttribute<RolCategoria, Boolean> activo;
    public static volatile CollectionAttribute<RolCategoria, UsuarioRolCategoria> usuarioRolCategoriaCollection;

}