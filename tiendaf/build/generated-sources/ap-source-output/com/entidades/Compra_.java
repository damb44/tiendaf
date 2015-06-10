package com.entidades;

import com.entidades.ProductoCompra;
import com.entidades.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fechaCompra;
    public static volatile CollectionAttribute<Compra, ProductoCompra> productoCompraCollection;
    public static volatile SingularAttribute<Compra, Proveedor> idProveedor;
    public static volatile SingularAttribute<Compra, Integer> id;

}