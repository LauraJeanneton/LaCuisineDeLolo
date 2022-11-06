package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "INGREDIENTS_RECETTES")
public class IngredientsRecette {

    @EmbeddedId IngredientRecettePrimaryKey pk;

    @Column
    private float quantite;

    @Column
    private String uniteMesure;
}

@Embeddable
@Data
class IngredientRecettePrimaryKey implements Serializable {

    private int idIngredient;
    private String nomIngredient;
}