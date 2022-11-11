package isil.pe.jpaep3.service;

import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.entity.Direccion;
import isil.pe.jpaep3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

        public String addCliente(Cliente cliente) {

            if(getClienteByEmail(cliente.getEmail()) == null){
                clienteRepository.save(cliente);
                return "Registro exitoso";
            } else {
               return "Correo Existente";
            }

        }
        @Transactional
        public String updateCliente(Cliente cliente, String email) {
            Cliente clienteToUpdate = clienteRepository.findClienteByEmail(email);

            if(clienteToUpdate != null){
                clienteToUpdate.setNombres(cliente.getNombres() != null ? cliente.getNombres(): clienteToUpdate.getNombres());
                clienteToUpdate.setApellidos(cliente.getApellidos() != null ? cliente.getApellidos(): clienteToUpdate.getApellidos());
                clienteToUpdate.setEmail(cliente.getEmail() != null ? cliente.getEmail(): clienteToUpdate.getEmail());
                clienteToUpdate.setDireccion(cliente.getDireccion() != null ? cliente.getDireccion(): clienteToUpdate.getDireccion());

                clienteRepository.save(clienteToUpdate);
                return "Actualizacion exitosa";
            } else{
                return "Correo no existe";
            }
        }
        public List<Cliente> getAllClientes() {

            return clienteRepository.findAll();
        }

        public String deleteCliente( String email){
            Cliente clienteToDelete = clienteRepository.findClienteByEmail(email);

            if(getClienteByEmail(clienteToDelete.getEmail()) != null){
                clienteRepository.delete(clienteToDelete);
                return "Cliente Eliminado";
            } else {
                return "No se puede eliminar cliente";
            }

        }

        public Cliente getClienteByEmail(String email){
            Optional<Cliente> cliente = Optional.ofNullable(clienteRepository.findClienteByEmail(email));

            if(cliente.isPresent())
            {
                return cliente.get();
            } else
            {
                return null;
            }
        }


        /*public List<Cliente> getByCiudad(String nombres) {

            return clienteRepository.findClienteByNombres(nombres);
        }*/




        //------------Codigo--------------


    }