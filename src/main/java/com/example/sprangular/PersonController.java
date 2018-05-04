package com.example.sprangular;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sprangular/resources/persons")
public class PersonController {
    private final PersonRepository repo;

    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Iterable<Person> listPersons() {
        System.out.println(">>> listPersons()");
        System.out.println("Records in repo: " + repo.count());
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping
    public Person savePerson(Person person) {
        return repo.save(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        repo.findById(id).ifPresent(repo::delete);
    }
}
