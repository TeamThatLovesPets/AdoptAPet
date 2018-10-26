package com.teampets.catsAndDogs.model.adoption_process;


import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "conversation")
public class Conversation extends BaseEntity {

    @OneToMany(mappedBy = "conversation", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    private List<Message> messages;
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private User petKeeper;
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private User potentialAdopter;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "adoption")
    private Adoption adoption;
}
