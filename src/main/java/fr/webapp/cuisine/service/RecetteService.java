package fr.webapp.cuisine.service;

import fr.webapp.cuisine.model.Recette;
import fr.webapp.cuisine.repository.RecetteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class RecetteService {

    @Autowired
    private RecetteRepository recetteRepository;

    public Recette getRecette(final int id){
        Recette recette = recetteRepository.findByIdRecette(1);
        return recette;
    }

    public Iterable<Recette> getRecettes(){
        for(Recette recette : recetteRepository.findAll());


        return recetteRepository.findAll();
    }

    public void deleteRecette(final int id){
        recetteRepository.deleteById(id);
    }

    public Recette saveRecette(Recette recette){
        Recette savedRecette = recetteRepository.save(recette);
        return savedRecette;
    }

}
