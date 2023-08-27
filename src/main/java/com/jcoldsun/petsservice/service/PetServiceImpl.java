package com.jcoldsun.petsservice.service;

import com.jcoldsun.petsservice.dto.PetDto;
import com.jcoldsun.petsservice.dto.api.GetAllPetsResponse;
import com.jcoldsun.petsservice.dto.api.GetPetsByIdsResponse;
import com.jcoldsun.petsservice.mapper.PetMapper;
import com.jcoldsun.petsservice.repository.PetRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PetServiceImpl implements PetService {
    PetRepository petRepository;
    PetMapper petMapper;

    @Override
    public GetAllPetsResponse getAllPets(Pageable pageable) {
        Page<PetDto> pets = petRepository.findAll(pageable)
                .map(petMapper::toDto);

        return new GetAllPetsResponse(pets);
    }

    @Override
    public GetPetsByIdsResponse getPetsByIds(List<Integer> ids) {
        List<PetDto> pets = petRepository.findAllById(ids).stream()
                .map(petMapper::toDto)
                .toList();

        return new GetPetsByIdsResponse(pets);
    }

}
