package com.teampets.catsAndDogs.model.personal_data;

import com.teampets.catsAndDogs.model.BaseEntity;
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
@Table(name = "address")
public class Address extends BaseEntity {

    @Column(name = "street")
    private String street;
    @Column(name = "country")
    private String country;
    @Column(name = "city")
    private String city;
    @Column(name = "house_number")
    private String houseNo;
    @Column(name = "apartment_number")
    private String apartmentNo;
}
