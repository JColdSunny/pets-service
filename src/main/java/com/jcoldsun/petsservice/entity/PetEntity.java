package com.jcoldsun.petsservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "pets")
public class PetEntity extends AbstractEntity {

    @Column
    private String name;

    @Column
    private Double weight;

    @Column
    private Double height;

    @ManyToOne
    @JoinColumn(name = "species_id", nullable = false)
    private SpecieEntity specie;

    @ManyToOne
    @JoinColumn(name = "breed_id", nullable = false)
    private BreedEntity breed;

}
