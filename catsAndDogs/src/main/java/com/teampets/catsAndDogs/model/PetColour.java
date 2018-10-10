package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pet_colour")
public class PetColour extends BaseEntity {

    @Column(name = "colour_label")
    private String colourLabel;
    //TODO: add constrains/mapping
    private PetType petType;
}
