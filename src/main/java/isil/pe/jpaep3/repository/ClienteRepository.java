package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.entity.Direccion;
import isil.pe.jpaep3.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByEmail(String email);

    List<Cliente> findClienteByDireccionCiudadDescripcion(@Param("descripcion") String descripcion);

    List<Cliente> findClienteByDireccionPaisDescripcion(@Param("descripcion") String descripcion);
}
