package com.entidades;

import com.entidades.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-09T21:53:49")
@StaticMetamodel(EmpresaProveedor.class)
public class EmpresaProveedor_ { 

    public static volatile CollectionAttribute<EmpresaProveedor, Proveedor> proveedorCollection;
    public static volatile SingularAttribute<EmpresaProveedor, String> direccion;
    public static volatile SingularAttribute<EmpresaProveedor, Integer> id;
    public static volatile SingularAttribute<EmpresaProveedor, String> telefono;
    public static volatile SingularAttribute<EmpresaProveedor, String> nombre;
    public static volatile SingularAttribute<EmpresaProveedor, String> email;

}