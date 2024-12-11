package com.example.controllers;



import com.example.entytis.Person;
import com.example.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")


public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // Zeigt die Liste der Personen an (GET-Anfrage)
    @GetMapping("/person")
    public String listMember(Model model) {
        model.addAttribute("person", personService.getAllPerson());
        return "person";  // Person-Seite anzeigen
    }

    // Zeigt die Formularseite zum Erstellen einer neuen Person an
    @GetMapping("/person/new")
    public String createMember(Model model) {
        model.addAttribute("person", new Person());
        return "add-person";  // Seite zum Hinzufügen einer neuen Person
    }

    // Speichert die Person (POST-Anfrage)
    @PostMapping("/person")
    public String savePerson(@ModelAttribute("person") Person person) {
        personService.savePerson(person);
        return "redirect:/person";  // Nach dem Speichern zurück zur Person-Seite
    }

    // Zeigt das Formular zum Bearbeiten einer Person an
    @GetMapping("/person/edit/{id}")
    public String editPerson(@PathVariable Long id, Model model) {
        model.addAttribute("person", personService.getPersonID(id));
        return "edit-person";  // Seite zum Bearbeiten einer Person
    }

    // Aktualisiert die Person (POST-Anfrage)
    @PostMapping("/person/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute("person") Person person) {
        Person editedPerson = personService.getPersonID(id);
        editedPerson.setFirstName(person.getFirstName());
        editedPerson.setStatus(person.getStatus());
        editedPerson.setContact(person.getContact());
        personService.updatePerson(editedPerson);
        return "redirect:/person";  // Nach dem Update zurück zur Person-Seite
    }

    // Löscht eine Person
    @GetMapping("/person/{id}")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "redirect:/person";  // Nach dem Löschen zurück zur Person-Seite
    }
}
