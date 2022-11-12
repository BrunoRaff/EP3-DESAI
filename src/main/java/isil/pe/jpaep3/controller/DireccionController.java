package isil.pe.jpaep3.controller;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Direccion;
import isil.pe.jpaep3.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/direccion")
public class DireccionController {
    @Autowired
    private DireccionService direccionService;

    @PostMapping("/añadir")
    public String addDireccion(@RequestParam(name = "idCity") Long cityId, @RequestParam(name = "idCountry") Long countryId, @RequestBody Direccion direccion){
        return direccionService.addDireccion(direccion, cityId, countryId);
    }

    @GetMapping({"/","/listar"})
    public List<Direccion> getAll(){
        return direccionService.getAllDirecciones();
    }
}
