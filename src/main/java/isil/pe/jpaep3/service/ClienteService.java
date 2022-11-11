package isil.pe.jpaep3.service;

import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

        public void addCliente(Cliente cliente) {
            //------------Codigo--------------
        }
        @Transactional
        public void updateCliente(Cliente cliente, String email) {
            Cliente clienteToUpdate = clienteRepository.findClienteByEmail(email);
            //------------Codigo--------------
        }
        public List<Cliente> getAllClientes() {
            //------------Codigo--------------
            return null;
        }

        public void deleteCliente(String email){
            //------------Codigo--------------
        }

        //------------Codigo--------------


    }