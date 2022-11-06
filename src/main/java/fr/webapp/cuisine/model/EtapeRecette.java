package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ETAPES_RECETTES")
@Data
public class EtapeRecette {

    @Id
    private int idRecette;

    @Column
    private int idEtape;

    @Column
    private String descrEtapes;
}
