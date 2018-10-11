package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "adoption")
public class Adoption extends BaseEntity {

    //TODO: add mapping
    private AdoptionStatus adoptionStatus;
    //TODO: add mapping
    private List<Conversation> conversations;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private User petKeeper; // TODO: we need solution to a problem of different
                            // mapping's for different subclass of User class
    @OneToOne(mappedBy = "") //TODO: add mapping
    private User finalAdopter;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private Pet pet;
    @Column(name = "adoption_date")
    private LocalDateTime adoptionDate;
}
