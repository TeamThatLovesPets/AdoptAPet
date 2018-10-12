package com.teampets.catsAndDogs.model.user;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.personal_data.Address;
import com.teampets.catsAndDogs.model.personal_data.LoginData;
import com.teampets.catsAndDogs.model.pet.Pet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Pet> pets;

    @OneToOne(cascade = CascadeType.ALL)
    private LoginData loginData;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
