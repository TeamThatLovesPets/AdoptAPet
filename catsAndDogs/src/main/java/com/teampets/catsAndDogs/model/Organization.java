package com.teampets.catsAndDogs.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organisation")
public class Organization extends User {

    @OneToOne(mappedBy = "") //TODO: add mapping
    private UserData leaderData;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private OrganizationData organizationData;
}
