package com.adoption.pata.controller;

import com.adoption.pata.model.animal.Animal;
import com.adoption.pata.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> findAll() {
        return ResponseEntity.ok().body(animalService.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Animal> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(animalService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Animal> insertAnimal (@RequestBody Animal animalObj) {
        animalObj = animalService.insert(animalObj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(animalObj.getId()).toUri();
        return ResponseEntity.created(uri).body(animalObj);
    }
}
