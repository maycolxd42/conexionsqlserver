package com.ed.ecommerce.mvcDemo.Controller;


import com.ed.ecommerce.mvcDemo.Model.Producto;
import com.ed.ecommerce.mvcDemo.Services.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pizzeria")
public class ProductoController {

    @Autowired
    private ServiceProducto serviceProducto;

    @GetMapping("/menu")
    public String mostrarMenu(Model model) {
        List<Producto> productos = serviceProducto.Listar();
        model.addAttribute("listado", productos);
        return "menu"; // Devuelve la vista menu.html
    }
}
