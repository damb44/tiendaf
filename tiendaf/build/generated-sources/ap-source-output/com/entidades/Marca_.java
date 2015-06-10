package com.entidades;

import com.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Integer> id;
    public static volatile CollectionAttribute<Marca, Producto> productoCollection;
    public static volatile SingularAttribute<Marca, String> nombre;

}