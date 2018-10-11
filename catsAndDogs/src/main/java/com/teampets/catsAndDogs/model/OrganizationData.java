package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organization_data")
public class OrganizationData extends BaseEntity {

    @Column(name = "organization_name")
    private String organizationName;
    @OneToOne(mappedBy = "") //TODO add mapping
    private LoginData loginData;
    @OneToOne(mappedBy = "") //TODO add mapping
    private Address address;
}
