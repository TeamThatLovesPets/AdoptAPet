package com.teampets.catsAndDogs.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet_colour")
public class PetColour extends BaseEntity {

    @Column(name = "colour_label")
    private String colourLabel;
    //TODO: add constrains/mapping
    private PetType petType;

    @OneToMany(mappedBy = "petColor", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
