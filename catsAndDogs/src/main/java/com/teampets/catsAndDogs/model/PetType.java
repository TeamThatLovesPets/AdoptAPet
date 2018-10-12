package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pet_type")
public class PetType extends BaseEntity {

    @Column(name = "type_name")
    private String typeName;

    @OneToMany(mappedBy = "petType", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
