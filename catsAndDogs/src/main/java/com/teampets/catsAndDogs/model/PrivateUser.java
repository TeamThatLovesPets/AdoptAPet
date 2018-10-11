package com.teampets.catsAndDogs.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "private_user")
public class PrivateUser extends User {

    @OneToOne(mappedBy = "") //TODO: add mapping
    private UserData userData;
}
