package maik.example.mscatalogo.repository;

import maik.example.mscatalogo.entity.Catalogo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CatalogoRepository extends JpaRepository<Catalogo, Integer>{
}
