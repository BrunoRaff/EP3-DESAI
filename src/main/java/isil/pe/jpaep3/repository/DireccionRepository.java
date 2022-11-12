package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Long> {
    Direccion findDireccionByCiudad(Ciudad ciudad);
}
