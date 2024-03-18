package com.adoption.pata.model.animal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String specie;
    private Integer age;
    private String color;
    private boolean availableForAdoption;

    public Animal(String name, String specie, Integer age, String color, boolean availableForAdoption) {
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.color = color;
        this.availableForAdoption = availableForAdoption;
    }
}
