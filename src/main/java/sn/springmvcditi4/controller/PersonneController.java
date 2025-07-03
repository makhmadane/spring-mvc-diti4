package sn.springmvcditi4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.springmvcditi4.entity.Personne;
import sn.springmvcditi4.repository.PersonneRepository;

import java.util.List;

@Controller
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;



    @GetMapping
    public String index(Model model) {
        List<Personne> personnes = personneRepository.findAll();
        model.addAttribute("personnes", personnes);
        return "index";
    }

}
