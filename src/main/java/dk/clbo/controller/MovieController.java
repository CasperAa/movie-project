package dk.clbo.controller;

import dk.clbo.services.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    MovieService service;

    @GetMapping("/")
    public String index(Model model){
        service = new MovieService();
        model.addAttribute("movies", service.getAllMovies());
        return "index";
    }
}
