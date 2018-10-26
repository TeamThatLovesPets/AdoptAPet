package com.teampets.catsAndDogs.model.util;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.pet.Pet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    private Pet pet;

    @Lob
    private byte[] pictures;

    @Column(name = "name")
    private String name;

    @Column(name = "upload_date")
    private LocalDate uploadDate;


}