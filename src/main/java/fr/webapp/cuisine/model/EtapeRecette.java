package fr.webapp.cuisine.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ETAPES_RECETTES")
@Data
public class EtapeRecette {

    @EmbeddedId EtapeRecettePrimaryKey pk;

    @Column(name = "DESCRETAPES")
    private String descrEtapes;
}


