package com.jcoldsun.petsservice.mapper;

import com.jcoldsun.petsservice.dto.BreedDto;
import com.jcoldsun.petsservice.entity.BreedEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface BreedMapper {

    BreedDto toDto(BreedEntity entity);

    @InheritInverseConfiguration
    BreedEntity toEntity(BreedDto dto);

}
