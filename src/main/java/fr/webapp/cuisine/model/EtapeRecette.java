package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ETAPES_RECETTES")
@Data
public class EtapeRecette {

    @EmbeddedId EtapeRecettePrimaryKey pk;


    @Column
    private String descrEtapes;
}


@Embeddable
@Data
class EtapeRecettePrimaryKey implements Serializable {

    private int idRecette;
    private int idEtape;
        }