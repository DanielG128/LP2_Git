package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

}
