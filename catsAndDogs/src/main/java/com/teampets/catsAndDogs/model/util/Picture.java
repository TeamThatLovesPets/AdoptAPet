package com.teampets.catsAndDogs.model.util;

import com.teampets.catsAndDogs.model.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {
    //TODO: add field with proper type

    @Lob
    private Byte[] pictures;

}
