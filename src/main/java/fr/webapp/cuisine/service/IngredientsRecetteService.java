package fr.webapp.cuisine.service;


import fr.webapp.cuisine.model.IngredientsRecette;
import fr.webapp.cuisine.model.Recette;
import fr.webapp.cuisine.repository.IngredientsRecetteRepository;
import fr.webapp.cuisine.repository.RecetteRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class IngredientsRecetteService {

    @Autowired
    private IngredientsRecetteRepository ingredientsRecetteRepository;


    public Iterable<IngredientsRecette> getIngredientsRecettes(){
        return ingredientsRecetteRepository.findAll();
    }


}

