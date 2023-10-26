package servicio;

import java.util.List;

import modelo.Categoria;

public interface CategoriaServicio {
	
	List<Categoria> obtenerTodas();
	Categoria obtenerPorId(Integer id);
	void guardarCategoria(Categoria categoria);

}
