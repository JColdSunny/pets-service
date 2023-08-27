package com.jcoldsun.petsservice.service;

import com.jcoldsun.petsservice.dto.SpecieDto;
import com.jcoldsun.petsservice.dto.api.GetAllSpeciesResponse;
import com.jcoldsun.petsservice.mapper.SpecieMapper;
import com.jcoldsun.petsservice.repository.SpecieRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SpecieServiceImpl implements SpecieService {
    SpecieRepository specieRepository;
    SpecieMapper specieMapper;

    @Override
    public GetAllSpeciesResponse getAll() {
        List<SpecieDto> species = specieRepository.findAll().stream()
                .map(specieMapper::toDto)
                .toList();

        return new GetAllSpeciesResponse(species);
    }

}
