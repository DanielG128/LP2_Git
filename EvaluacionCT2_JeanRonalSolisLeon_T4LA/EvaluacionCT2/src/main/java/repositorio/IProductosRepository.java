package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Productos;

public interface IProductosRepository extends JpaRepository<Productos, Integer> {

}
