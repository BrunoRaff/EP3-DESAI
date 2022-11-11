package isil.pe.jpaep3.controller;

import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/añadir")
    public void addCliente(@RequestBody Cliente cliente){
        clienteService.addCliente(cliente);
    }

    @PostMapping("/actualizar")
    public void updateCliente(@RequestParam String email, @RequestBody Cliente cliente){
        clienteService.updateCliente(cliente,email);
    }

    @GetMapping("/eliminar")
    public void deleteCliente(@RequestParam String email){
        clienteService.deleteCliente(email);
    }

    @GetMapping({"/","/listar"})
    public List<Cliente> getAllItems(){
        return clienteService.getAllClientes();
    }

    //------------Codigo--------------
}
