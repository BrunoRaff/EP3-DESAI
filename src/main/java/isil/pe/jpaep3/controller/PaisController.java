package isil.pe.jpaep3.controller;

import isil.pe.jpaep3.entity.Pais;
import isil.pe.jpaep3.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {
    @Autowired
    private PaisService paisService;

    @PostMapping("/añadir")
    public String addPais(@RequestBody Pais pais){
        return paisService.addPais(pais);
    }

    @GetMapping({"/","/listar"})
    public List<Pais> getAll(){
        return paisService.getAllPaises();
    }

}
