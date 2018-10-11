package com.teampets.catsAndDogs.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pet")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "height")
    private Float height;
    @Column(name = "pet_colour")
    private PetColour petColour;
    @OneToMany(mappedBy = "") //TODO: add mapping
    private List<Picture> pictures;

    //TODO: add mapping
    private User owner;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "special_marks_description")
    private String specialMarksDescription;
    @OneToMany(mappedBy = "") //TODO: add mapping
    private PetType petType;
    @Column(name = "localization")
    private Geolocalization localization;

    //TODO: add mapping
    private Adoption adoption;


}
