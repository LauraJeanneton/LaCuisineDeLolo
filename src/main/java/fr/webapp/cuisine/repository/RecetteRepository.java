package fr.webapp.cuisine.repository;

import fr.webapp.cuisine.model.Recette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetteRepository extends CrudRepository<Recette,Integer> {
    List<Recette> findAll();
}
