package com.jcoldsun.petsservice.mapper;

import com.jcoldsun.petsservice.dto.PetDto;
import com.jcoldsun.petsservice.entity.PetEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(uses = {SpecieMapper.class, BreedMapper.class})
public interface PetMapper {

    PetDto toDto(PetEntity pet);

    @InheritInverseConfiguration
    PetEntity toEntity(PetDto petDto);

}
