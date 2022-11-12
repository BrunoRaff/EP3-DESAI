package isil.pe.jpaep3.service;

import isil.pe.jpaep3.entity.Ciudad;
import isil.pe.jpaep3.entity.Direccion;
import isil.pe.jpaep3.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionService {
    @Autowired
    private DireccionRepository direccionRepository;

    public String addDireccion(Direccion direccion){
        if(getDireccionByCiudad(direccion.getCiudad())==null){
            direccionRepository.save(direccion);
            return "Registro exitoso";
        }else {
            return "Registro fallido";
        }
    }

    public Direccion getDireccionByCiudad(Ciudad ciudad){
        Optional<Direccion> direccion = Optional.ofNullable(direccionRepository.findDireccionByCiudad(ciudad));

        if(direccion.isPresent()){
            return direccion.get();
        }else {
            return null;
        }
    }

    public List<Direccion> getAllDirecciones(){
        return direccionRepository.findAll();
    }
}
