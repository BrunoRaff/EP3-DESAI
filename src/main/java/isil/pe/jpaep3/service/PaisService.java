package isil.pe.jpaep3.service;

import isil.pe.jpaep3.entity.Pais;
import isil.pe.jpaep3.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public String addPais(Pais pais){
        if(getPaisByDescripcion(pais.getDescripcion())==null){
            paisRepository.save(pais);
            return "Registro exitoso";
        }else{
            return "Registro fallido";
        }
    }
    public Pais getPaisByDescripcion(String descripcion){
        Optional<Pais> pais = Optional.ofNullable(paisRepository.findPaisByDescripcion(descripcion));
        if(pais.isPresent()){
            return pais.get();
        }else {
            return null;
        }
    }

    public List<Pais> getAllPaises(){
        return paisRepository.findAll();
    }
}
