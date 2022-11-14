package isil.pe.jpaep3.controller;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Cliente;
import isil.pe.jpaep3.entity.Pais;
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

    @PutMapping("/actualizar/{email}")
    public String updateCliente(@PathVariable String email, @RequestBody Cliente cliente){
        return clienteService.updateCliente(cliente, email);
    }

    @DeleteMapping("/eliminar/{email}")
    public void deleteCliente(@PathVariable String email){
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

    @GetMapping("/getByDireccionCiudad")
    public List<Cliente> getByDireccionCiudad(@RequestParam String ciudad) {
        return clienteService.getByDireccionCiudad(ciudad);
    }

    @GetMapping("/getByDireccionPais")
    public List<Cliente> getByDireccionPais (@RequestParam String pais) {
        return clienteService.getByDireccionPais(pais);
    }
}
