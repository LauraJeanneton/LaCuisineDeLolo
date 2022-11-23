package fr.webapp.cuisine.service;

import fr.webapp.cuisine.model.EtapeRecette;
import fr.webapp.cuisine.model.IngredientsRecette;
import fr.webapp.cuisine.repository.EtapeRecetteRepository;
import fr.webapp.cuisine.repository.IngredientsRecetteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class EtapeRecetteService {

    @Autowired
    private EtapeRecetteRepository etapeRecetteRepository;


    public Iterable<EtapeRecette> getEtapesRecettes(){
        return etapeRecetteRepository.findAll();
    }
   public Iterable<EtapeRecette> getEtapesRecette(Integer id){
        System.out.println(etapeRecetteRepository.findByPk_IdRecetteOrderByPk(id));
        return etapeRecetteRepository.findByPk_IdRecetteOrderByPk(id);
   }
}
