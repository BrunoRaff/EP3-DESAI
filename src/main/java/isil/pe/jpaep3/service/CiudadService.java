package isil.pe.jpaep3.service;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Pais;
import isil.pe.jpaep3.repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {
    @Autowired
    private CiudadRepository ciudadRepository;

    public String addCiudad(Ciudad ciudad) {

        if(getCiudadByPais(ciudad.getPais()) == null){
            ciudadRepository.save(ciudad);
            return "Registro exitoso";
        } else {
            return "Registro fallido";
        }

    }

    public Ciudad getCiudadByPais(Pais pais){
        Optional<Ciudad> ciudad = Optional.ofNullable(ciudadRepository.findCiudadByPais(pais));

        if(ciudad.isPresent()){
            return ciudad.get();
        }else {
            return null;
        }
    }


    public List<Ciudad> getAllCiudades(){
        return ciudadRepository.findAll();
    }

}
