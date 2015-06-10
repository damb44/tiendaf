package com.entidades;

import com.entidades.Compra;
import com.entidades.Producto;
import com.entidades.ProductoCompraPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(ProductoCompra.class)
public class ProductoCompra_ { 

    public static volatile SingularAttribute<ProductoCompra, Compra> compra;
    public static volatile SingularAttribute<ProductoCompra, BigDecimal> precioCompra;
    public static volatile SingularAttribute<ProductoCompra, Integer> cantidad;
    public static volatile SingularAttribute<ProductoCompra, Producto> producto;
    public static volatile SingularAttribute<ProductoCompra, ProductoCompraPK> productoCompraPK;

}