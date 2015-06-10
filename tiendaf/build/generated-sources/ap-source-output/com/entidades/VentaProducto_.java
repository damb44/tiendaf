package com.entidades;

import com.entidades.Producto;
import com.entidades.VentaProductoPK;
import com.entidades.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(VentaProducto.class)
public class VentaProducto_ { 

    public static volatile SingularAttribute<VentaProducto, VentaProductoPK> ventaProductoPK;
    public static volatile SingularAttribute<VentaProducto, BigDecimal> valor;
    public static volatile SingularAttribute<VentaProducto, Ventas> ventas;
    public static volatile SingularAttribute<VentaProducto, Integer> cantidad;
    public static volatile SingularAttribute<VentaProducto, Producto> producto;

}