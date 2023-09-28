package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import modelo.Medicamentos;

public interface IMediRepositorio extends JpaRepository<Medicamentos, Integer>  {

}
