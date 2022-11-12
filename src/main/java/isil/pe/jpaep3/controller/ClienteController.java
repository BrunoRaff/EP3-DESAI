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
    public String addCliente(@RequestBody Cliente cliente){
       return clienteService.addCliente(cliente);
    }

    @PostMapping("/actualizar")
    public String updateCliente(@RequestParam String email, @RequestBody Cliente cliente){
        return clienteService.updateCliente(cliente,email);
    }

    @PostMapping("/eliminar")
    public void deleteCliente(@RequestParam String email){
        System.out.println(email);
        clienteService.deleteCliente(email);
    }

    @GetMapping({"/","/listar"})
    public List<Cliente> getAll(){
        return clienteService.getAllClientes();
    }


    @GetMapping("/getByEmail")
    public Cliente getByEmail(@RequestParam String email){
        return clienteService.getClienteByEmail(email);
    }

    @GetMapping("/getByCiudad")
    public List<Cliente> getByCiudad(@RequestParam String descripcion) {
        return clienteService.getByCiudad(descripcion);
    }
    @GetMapping("/getByPais")
    public List<Cliente> getByPais(@RequestParam String descripcion) {
        return clienteService.getByPais(descripcion);
    }
}
