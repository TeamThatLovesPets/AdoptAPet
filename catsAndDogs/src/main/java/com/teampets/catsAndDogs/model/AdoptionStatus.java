package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adoption_status")
public class AdoptionStatus extends BaseEntity {

    @Column(name = "status_name")
    private String adoptionStatusName;
}
