package controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import servicio.ProductoServicio;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoServicio productoService;

	@GetMapping("/catalogo")
    public String mostrarProductos(Model model) {
        model.addAttribute("productos", productoService.obtenerTodos());
        return "catalogo";
    }

}
