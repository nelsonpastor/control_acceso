package co.edu.ims.modelo;

import co.edu.ims.modelo.Persona;
import co.edu.ims.modelo.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-03T20:01:21")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Persona> persona;
    public static volatile SingularAttribute<Usuarios, Integer> id_usuario;
    public static volatile SingularAttribute<Usuarios, String> correo;
    public static volatile ListAttribute<Usuarios, Rol> roles;
    public static volatile SingularAttribute<Usuarios, String> nombreUsuarios;
    public static volatile SingularAttribute<Usuarios, String> contrasena;

}