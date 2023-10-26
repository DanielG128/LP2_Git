package servicio;

import java.util.List;

import modelo.Productos;

public interface ProductoServicio {
	
	List<Productos> obtenerTodos();
	Productos obtenerPorId(Integer id);
	void guardarProductos(Productos productos);

}
