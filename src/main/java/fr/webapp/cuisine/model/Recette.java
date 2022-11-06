package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="RECETTES")
public class Recette {

    @Column(name = "IDRECETTE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecette;

    @Id()
    @Column(name = "NOMRECETTE")
    private String nomRecette;

    @Column(name = "IDCAT")
    private int idCat;

    @Column(name = "TPSCUISSON")
    private int tpsCuisson;

    @Column(name = "TPSREPOS")
    private int tpsRepos;

    @Column(name = "TPSPREPA")
    private int tpsPrepa;

    @Column(name = "NBPERS")
    private int nbPers;

    @Column(name = "NOTE")
    private int note;

    @Column(name = "URLIMG")
    private String urlImg;
}
