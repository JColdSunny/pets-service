package com.jcoldsun.petsservice.mapper;

import com.jcoldsun.petsservice.dto.SpecieDto;
import com.jcoldsun.petsservice.entity.SpecieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface SpecieMapper {

    SpecieDto toDto(SpecieEntity specie);

    @InheritInverseConfiguration
    SpecieEntity toEntity(SpecieDto specieDto);

}
