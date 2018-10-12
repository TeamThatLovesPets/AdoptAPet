package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
public class User extends BaseEntity {

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Pet> pets  = new ArrayList<>();
}
