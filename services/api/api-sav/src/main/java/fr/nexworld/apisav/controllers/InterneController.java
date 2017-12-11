package fr.nexworld.apisav.controllers;

import fr.nexworld.apisav.entities.Interne;
import fr.nexworld.apisav.services.InterneService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/internes")
public class InterneController {

    private InterneService interneService;

    @Autowired
    public InterneController(InterneService interneService) {
        this.interneService = interneService;
    }

    @GetMapping("/{id}")
    Interne get(@PathVariable Long id) {
        return this.interneService.get(id);
    }

    @GetMapping
    List<Interne> getAll() {
        return this.interneService.getAll();
    }

    @PostMapping
    Interne post(@RequestBody Interne interne) {
        return this.interneService.post(interne);
    }

    @PutMapping("/{id}")
    Interne put(@RequestBody Interne interne, @PathVariable Long id) {
        return this.interneService.put(interne, id);
    }
}