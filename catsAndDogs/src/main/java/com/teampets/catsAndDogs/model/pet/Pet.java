package com.teampets.catsAndDogs.model.pet;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.personal_data.GeoLocalization;
import com.teampets.catsAndDogs.model.user.User;
import com.teampets.catsAndDogs.model.util.Picture;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//import com.teampets.catsAndDogs.model.adoption_process.Adoption;

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

    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL)
    private List<Picture> pictures;

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

    @JoinColumn(name = "localization")
    @OneToOne(cascade = CascadeType.ALL)
    private GeoLocalization localization;

//    @OneToOne(mappedBy = "pet", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
//    private Adoption adoption;
}
