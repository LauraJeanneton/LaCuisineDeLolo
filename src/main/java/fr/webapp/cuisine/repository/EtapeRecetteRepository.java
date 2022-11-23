package fr.webapp.cuisine.repository;

import fr.webapp.cuisine.model.EtapeRecette;
import fr.webapp.cuisine.model.EtapeRecettePrimaryKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapeRecetteRepository extends CrudRepository<EtapeRecette, EtapeRecettePrimaryKey> {
    Iterable<EtapeRecette> findByPk_IdRecetteOrderByPk(Integer id);
}
