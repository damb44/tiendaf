package com.entidades;

import com.entidades.VentaProducto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, Integer> idCliente;
    public static volatile SingularAttribute<Ventas, Integer> id;
    public static volatile CollectionAttribute<Ventas, VentaProducto> ventaProductoCollection;

}