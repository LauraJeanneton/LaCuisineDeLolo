package fr.webapp.cuisine.controller;

import fr.webapp.cuisine.model.Recette;
import fr.webapp.cuisine.service.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuisineController {

    @Autowired
    private RecetteService recetteService;

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println(recetteService.getRecettes());
        Recette recette = new Recette();

        return "hello";
    }

    @GetMapping("/accueil")
    public String accueil(Model model){
        Iterable<Recette> listRecettes = recetteService.getRecettes();
        for(Recette recette : listRecettes)
        System.out.println(recette);
        model.addAttribute("recettes",listRecettes);
        return ("accueil");
    }
}
