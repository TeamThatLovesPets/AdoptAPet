package com.teampets.catsAndDogs.model.pet;

import com.teampets.catsAndDogs.model.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
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
