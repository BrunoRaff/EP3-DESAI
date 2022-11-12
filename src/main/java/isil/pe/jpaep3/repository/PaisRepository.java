package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    Pais findPaisByDescripcion(String descripcion);

}
