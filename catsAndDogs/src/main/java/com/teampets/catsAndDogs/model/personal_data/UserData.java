package com.teampets.catsAndDogs.model.personal_data;

import com.teampets.catsAndDogs.model.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@Table(name = "user_data")
public class UserData extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "loginData")
    @OneToOne(cascade = CascadeType.ALL)
    private LoginData loginData;

    @Column(name = "address")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
