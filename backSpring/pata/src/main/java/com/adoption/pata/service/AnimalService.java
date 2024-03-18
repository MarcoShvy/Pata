package com.adoption.pata.service;

import com.adoption.pata.model.animal.Animal;
import com.adoption.pata.model.animal.AnimalDTO;
import com.adoption.pata.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;


    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    public Animal findById(Long id) {
        Optional<Animal> animalObj = animalRepository.findById(id);
        return animalObj.get();
    }

    public Animal create(AnimalDTO animalDTO) {

        Animal animalObj = new Animal(animalDTO.name(), animalDTO.specie(), animalDTO.age(), animalDTO.color(), animalDTO.availableForAdoption());

        this.animalRepository.save(animalObj);
        return animalObj;
    }
}
