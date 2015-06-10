package com.entidades;

import com.entidades.Compra;
import com.entidades.EmpresaProveedor;
import com.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> sApellido;
    public static volatile CollectionAttribute<Proveedor, Compra> compraCollection;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, String> sNombre;
    public static volatile SingularAttribute<Proveedor, String> celular;
    public static volatile SingularAttribute<Proveedor, String> pNombre;
    public static volatile SingularAttribute<Proveedor, String> pApellido;
    public static volatile SingularAttribute<Proveedor, EmpresaProveedor> idEmpresa;
    public static volatile SingularAttribute<Proveedor, Integer> id;
    public static volatile CollectionAttribute<Proveedor, Producto> productoCollection;
    public static volatile SingularAttribute<Proveedor, String> telefono;
    public static volatile SingularAttribute<Proveedor, String> email;

}