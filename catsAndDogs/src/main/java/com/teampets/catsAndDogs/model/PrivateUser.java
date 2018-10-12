package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "private_user")
public class PrivateUser extends User {

    @OneToOne(mappedBy = "") //TODO: add mapping
    private UserData userData;
}
