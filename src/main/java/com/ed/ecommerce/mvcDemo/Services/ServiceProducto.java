package com.ed.ecommerce.mvcDemo.Services;

import com.ed.ecommerce.mvcDemo.Model.Producto;
import com.ed.ecommerce.mvcDemo.Repository.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProducto {

    @Autowired
    private IProducto iProductoRepository;

    public List<Producto> Listar(){

        return iProductoRepository.Listar();

    }

}
