package com.ed.ecommerce.mvcDemo.Repository;

import com.ed.ecommerce.mvcDemo.Model.Producto;

import java.util.List;

public interface IProducto {

    List<Producto> Listar();

    Producto ListarPorId(int id);

    int crear(Producto producto);

    int modificar(Producto producto);

    int eliminar(int id);

}
