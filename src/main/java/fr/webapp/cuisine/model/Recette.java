package fr.webapp.cuisine.model;

import lombok.Data;
import net.bytebuddy.asm.Advice;
import org.thymeleaf.util.DateUtils;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

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

    public String getTpsCuisson(){
        return String.format("%02d:%02d", tpsCuisson / 60, tpsCuisson % 60);
    }

    public String getTpsPrepa(){
        return String.format("%02d:%02d", tpsPrepa / 60, tpsPrepa% 60);
    }
}
