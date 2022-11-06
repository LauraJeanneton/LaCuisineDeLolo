package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="RECETTES")
public class Recette {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecette;

    @Id
    private String nomRecette;

    @Column
    private int idCat;

    @Column
    private int tpsCuisson;

    @Column
    private int tpsRepos;

    @Column
    private int tpsPrepa;

    @Column
    private int nbPers;

    @Column
    private int note;
}
