package isil.pe.jpaep3.repository;

import isil.pe.jpaep3.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByEmail(String email);

    //------------Codigo--------------

}
