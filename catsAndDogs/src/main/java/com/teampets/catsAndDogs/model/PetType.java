package com.teampets.catsAndDogs.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity {

    @Column(name = "type_name")
    private String typeName;

    @OneToMany(mappedBy = "petType", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
