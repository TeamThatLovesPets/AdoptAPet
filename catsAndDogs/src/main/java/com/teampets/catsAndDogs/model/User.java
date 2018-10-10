package com.teampets.catsAndDogs.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends BaseEntity {

    @OneToMany(mappedBy = "") //TODO: add mapping
    private List<Pet> pets  = new ArrayList<>();
}
