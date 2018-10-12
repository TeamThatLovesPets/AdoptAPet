package com.teampets.catsAndDogs.model.user;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.pet.Pet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
public class User extends BaseEntity {

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Pet> pets;
}
