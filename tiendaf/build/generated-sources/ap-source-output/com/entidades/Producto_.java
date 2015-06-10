package com.entidades;

import com.entidades.Categoria;
import com.entidades.Marca;
import com.entidades.ProductoCompra;
import com.entidades.Proveedor;
import com.entidades.VentaProducto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile CollectionAttribute<Producto, ProductoCompra> productoCompraCollection;
    public static volatile SingularAttribute<Producto, Proveedor> idProveedor;
    public static volatile SingularAttribute<Producto, Date> fechaVenc;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, BigDecimal> precioVenta;
    public static volatile SingularAttribute<Producto, Marca> idMarca;
    public static volatile SingularAttribute<Producto, Categoria> idCategoria;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile CollectionAttribute<Producto, VentaProducto> ventaProductoCollection;

}