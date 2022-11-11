package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DecimalFormat;

@Data
@Entity
@Table(name = "INGREDIENTS_RECETTES")
public class IngredientsRecette {

    @EmbeddedId IngredientRecettePrimaryKey pk;

    @Column(name = "QUANTITE")
    private float quantite;

    @Column(name = "UNITEMESURE")
    private String uniteMesure;

    @Column(name = "SOUSRECETTE")
    private String sousRecette;

    public String getQuantite(){
        DecimalFormat df = new DecimalFormat();
        return df.format(quantite);
    }
}

