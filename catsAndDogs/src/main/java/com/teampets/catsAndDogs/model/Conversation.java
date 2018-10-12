package com.teampets.catsAndDogs.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "conversation")
public class Conversation extends BaseEntity {

    @OneToMany(mappedBy = "") //TODO: add mapping
    private List<Message> messages;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private User petKeeper;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private User potentialAdopter;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private Adoption adoption;
}
