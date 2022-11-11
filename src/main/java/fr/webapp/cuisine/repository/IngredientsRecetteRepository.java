package fr.webapp.cuisine.repository;

import fr.webapp.cuisine.model.IngredientsRecette;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IngredientsRecetteRepository<IngredientRecettePrimaryKey> extends CrudRepository<IngredientsRecette, IngredientRecettePrimaryKey> {



}
