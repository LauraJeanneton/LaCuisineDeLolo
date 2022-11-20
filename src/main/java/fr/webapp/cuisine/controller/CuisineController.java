package fr.webapp.cuisine.controller;

import fr.webapp.cuisine.model.IngredientsRecette;
import fr.webapp.cuisine.model.Recette;

import fr.webapp.cuisine.service.IngredientsRecetteService;
import fr.webapp.cuisine.service.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Optional;

@Controller
public class CuisineController {

    @Autowired
    private RecetteService recetteService;
    @Autowired
    private IngredientsRecetteService ingredientsRecetteService;

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println(recetteService.getRecettes());
        return "hello";
    }

    @GetMapping("/accueil")
    public String accueil(Model model){
        Iterable<Recette> listRecettes = recetteService.getRecettes();

        Iterable<IngredientsRecette> ingredients = ingredientsRecetteService.getIngredientsRecettes();
for (IngredientsRecette ir:ingredients)
    System.out.println(ir);

        model.addAttribute("recettes",listRecettes);
        model.addAttribute("ingredients",ingredients);
        return ("accueil");
    }

    @GetMapping("/placard")
    public String getPlacard(Model model) {
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonth().getValue();
        int firstDay = getFirstDayInMonth(year,month);
        ArrayList<Integer> monthDays = new ArrayList<>();
        for(int i=0; i<firstDay;i++){
            monthDays.add(0);
        }
        for(int i=1; i<= YearMonth.of(year,month).lengthOfMonth();i++) monthDays.add(i);
        System.out.println(monthDays);
        model.addAttribute("days",monthDays);
        model.addAttribute("month",StringUtils.capitalize(LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE)));

        return ("placard");
    }

    public int getFirstDayInMonth(int year, int month) {
        return YearMonth.of(year,month).atDay( 1 ).getDayOfWeek().getValue()-1;
    }

    @GetMapping("/header")
    public String getHeader(Model model){
        return ("header");
    }

    @GetMapping("/addRecette")
    public String pageAjoutRecette(Model model){
        return "ajoutRecette";
    }

    @PostMapping("/{idRecette}")
    public String afficherRecette(@PathVariable("idRecette") String idRecette){
        Optional<Recette> recette=recetteService.getRecette(1);
//        recette.setAfficherRecette(true);
        return "accueil";
    }
}

