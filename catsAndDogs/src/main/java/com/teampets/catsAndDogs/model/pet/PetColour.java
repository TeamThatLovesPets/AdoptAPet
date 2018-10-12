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

    @JoinColumn(name = "pet_type")
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private PetType petType;

    @OneToMany(mappedBy = "petColour", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
