package com.entidades;

import com.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile CollectionAttribute<Categoria, Producto> productoCollection;
    public static volatile SingularAttribute<Categoria, String> nombre;

}