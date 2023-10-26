package controlador;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelo.Productos;
import servicio.ProductoServicio;

@Controller
public class CarritoController {
	private List<Productos> carrito = new ArrayList<>();
	
	@Autowired
	private ProductoServicio productoServicio;
	
	@PostMapping("/addtochart")
	public String addToChart(@RequestParam("productoId") Integer productoId) {
		Productos producto = productoServicio.obtenerPorId(productoId);
		carrito.add(producto);

		return "redirect:/catalogo";
	}
	
	@GetMapping("/carrito")
	public String mostrarCarrito(Model model) {		
		model.addAttribute("productosEnCarrito", carrito);		
		double montoTotal = carrito.stream().mapToDouble(Productos::getPrecio).sum();
		model.addAttribute("montoTotal", montoTotal);

		return "carrito";
	}

}
