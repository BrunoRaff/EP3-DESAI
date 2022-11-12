package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
    Ciudad findCiudadByPais(Pais pais);

}
