package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "INGREDIENTS_RECETTES")
public class IngredientsRecette {
    @Id
    private int idIngredient;

    @Id
    private String nomIngredient;

    @Column
    private float quantite;

    @Column
    private String uniteMesure;
}
