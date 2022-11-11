package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByEmail(String email);
/*
    List<Cliente> findClienteByNombres(String nombres);

   // List<Cliente> findByDireccion(String direccion1);

   // Cliente findClienteByPais(String pais);
*/

    //------------Codigo--------------

}
