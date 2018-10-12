package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
    @OneToOne(mappedBy = "") //TODO add mapping
    private LoginData loginData;
    @OneToOne(mappedBy = "") //TODO add mapping
    private Address address;
}
