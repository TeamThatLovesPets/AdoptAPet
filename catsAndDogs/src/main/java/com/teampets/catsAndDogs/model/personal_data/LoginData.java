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
@Table(name = "login_data")
public class LoginData extends BaseEntity {

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "loginData", cascade = CascadeType.ALL)
    private UserData userData;
}
