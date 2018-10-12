package com.teampets.catsAndDogs.model.pet;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.adoption_process.Adoption;
import com.teampets.catsAndDogs.model.personal_data.Geolocalization;
import com.teampets.catsAndDogs.model.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pet")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private Float weight;
    @Column(name = "height")
    private Float height;

    @JoinColumn(name = "pet_colour")
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private PetColour petColour;

    // TODO: add pet
//    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
//    private List<Picture> pictures;

    @JoinColumn(name = "owner")
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private User owner;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "special_marks_description")
    private String specialMarksDescription;

    @JoinColumn(name = "pet_type")
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private PetType petType;
    @Column(name = "localization")
    private Geolocalization localization;

    @OneToOne(mappedBy = "pet", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private Adoption adoption;


}