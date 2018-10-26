package com.teampets.catsAndDogs.model.adoption_process;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.pet.Pet;
import com.teampets.catsAndDogs.model.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Setter
@Getter
@Builder
@Entity
@Table(name = "adoption")
public class Adoption extends BaseEntity {

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "status")
    private AdoptionStatus adoptionStatus;

//    TODO: add mapping
//    private List<Conversation> conversations;
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private User petKeeper; // TODO: we need solution to a problem of different
//                            // mapping's for different subclass of User class
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private User finalAdopter;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private Pet pet;

    @Column(name = "adoption_date")
    private LocalDateTime adoptionDate;
}
