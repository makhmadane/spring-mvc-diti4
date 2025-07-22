package sn.springmvcditi4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sn.springmvcditi4.entity.Personne;
import sn.springmvcditi4.repository.PersonneRepository;

import java.util.List;

@Controller
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneRepository personneRepository;



    @GetMapping
    public String index(@RequestParam(defaultValue = "") String keyword, Model model) {
        List<Personne> personnes = personneRepository.findByNomContainingIgnoreCaseOrPrenomContainsIgnoreCase(keyword,keyword);
        model.addAttribute("personnes", personnes);
        return "index";
    }

    @GetMapping("/new")
    public String newUserForm(Model model) {
        model.addAttribute("personne", new Personne());
        return "form";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("personne") Personne personne) {
        personneRepository.save(personne);
        return "redirect:/personne";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("personne", personneRepository.findById(id).get());
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        personneRepository.deleteById(id);
        return "redirect:/personne";
    }

}
