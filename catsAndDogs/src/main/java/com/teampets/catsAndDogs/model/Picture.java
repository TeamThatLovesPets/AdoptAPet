package com.teampets.catsAndDogs.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Builder
@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {
    //TODO: add field with proper type

}
