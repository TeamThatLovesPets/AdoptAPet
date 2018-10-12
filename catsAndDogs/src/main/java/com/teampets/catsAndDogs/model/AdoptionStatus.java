package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "adoption_status")
public class AdoptionStatus extends BaseEntity {

    @Column(name = "status_name")
    private String adoptionStatusName;
}
