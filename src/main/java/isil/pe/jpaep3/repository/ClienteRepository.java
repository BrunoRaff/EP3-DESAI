package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByEmail(String email);

    @Query("SELECT c FROM Cliente c INNER JOIN Direccion d ON c.direccion = d.id  INNER JOIN Ciudad ci ON d.ciudad = ci.id WHERE ci.descripcion = :descripcion")
    List<Cliente> findClienteByCiudad(@Param("descripcion") String descripcion);

/*
    List<Cliente> findClienteByNombres(String nombres);

   // List<Cliente> findByDireccion(String direccion1);

   // Cliente findClienteByPais(String pais);
*/

    //------------Codigo--------------

}
