package com.teampets.catsAndDogs.model.user;

import com.teampets.catsAndDogs.model.adoption_process.Message;
import com.teampets.catsAndDogs.model.personal_data.Address;
import com.teampets.catsAndDogs.model.personal_data.LoginData;
import com.teampets.catsAndDogs.model.pet.Pet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Setter
@Getter
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "organization")
public class Organization extends User {

    public Organization(String firstName, String lastName, List<Pet> pets, LoginData loginData, Address address, String organizationName, List<Message> messages) {
        super(firstName, lastName, pets, loginData, address, messages);
        this.organizationName = organizationName;
    }

    @Column(name = "organization_name")
    private String organizationName;

}
