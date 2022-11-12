package isil.pe.jpaep3.controller;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @PostMapping("/añadir")
    public String addCiudad(@RequestBody Ciudad ciudad){
        return ciudadService.addCiudad(ciudad);
    }

    @GetMapping({"/","/listar"})
    public List<Ciudad> getAll(){
        return ciudadService.getAllCiudades();
    }
}
