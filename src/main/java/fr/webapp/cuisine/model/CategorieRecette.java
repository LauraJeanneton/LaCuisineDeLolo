package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CATEGORIES_RECETTES")
public class CategorieRecette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCat;

    @Column
    private String nomCat;
}
