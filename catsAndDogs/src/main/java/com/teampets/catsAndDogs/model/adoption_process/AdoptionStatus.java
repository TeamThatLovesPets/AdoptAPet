package com.teampets.catsAndDogs.model.adoption_process;

import com.teampets.catsAndDogs.model.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
@Entity
@Table(name = "adoption_status")
public class AdoptionStatus extends BaseEntity {

    @OneToMany(mappedBy = "adoptionStatus", cascade = {CascadeType.REFRESH,CascadeType.DETACH, CascadeType.MERGE})
    private List<Adoption> adoptions;

    @Column(name = "status_name")
    private String adoptionStatusName;
}
