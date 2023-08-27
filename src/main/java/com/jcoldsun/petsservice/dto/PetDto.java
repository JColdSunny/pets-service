package com.jcoldsun.petsservice.dto;

public record PetDto(int id, String name, Double weight, Double height, SpecieDto specie, BreedDto breed) {
}
