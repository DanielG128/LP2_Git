package servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.Productos;
import repositorio.IProductosRepository;
@Service
public class ProductoServiciolmpl implements ProductoServicio{
	
	@Autowired
	private IProductosRepository productosRepository;

	@Override
	public List<Productos> obtenerTodos() {		
		return productosRepository.findAll();
	}
	
	@Override
	public Productos obtenerPorId(Integer id) {
		return productosRepository.findById(id).orElse(null);
	}

	@Override
	public void guardarProductos(Productos producto) {
		productosRepository.save(producto);

	}

}
