package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "login_data")
public class LoginData extends BaseEntity {

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}
