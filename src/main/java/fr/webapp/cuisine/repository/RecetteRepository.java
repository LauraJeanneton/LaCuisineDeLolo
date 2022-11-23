package fr.webapp.cuisine.repository;

import fr.webapp.cuisine.model.Recette;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecetteRepository extends CrudRepository<Recette,Integer> {
    List<Recette> findAll();
    Recette findByIdRecette(Integer id);
}
