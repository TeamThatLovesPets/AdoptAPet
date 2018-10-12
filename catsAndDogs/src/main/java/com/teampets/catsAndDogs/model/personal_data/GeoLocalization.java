package com.teampets.catsAndDogs.model.personal_data;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.pet.Pet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Builder
@Entity
@Table(name = "geo_localization")
public class GeoLocalization extends BaseEntity {

    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "latitude")
    private Double latitude;

    @OneToOne(mappedBy = "localization", cascade = CascadeType.ALL)
    private Pet pet;
}
