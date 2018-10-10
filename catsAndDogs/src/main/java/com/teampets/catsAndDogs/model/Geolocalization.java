package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "geolocalization")
public class Geolocalization extends BaseEntity {

    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;
    //TODO: add mapping
    private Pet pet;
}
