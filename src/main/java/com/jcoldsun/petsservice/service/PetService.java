package com.jcoldsun.petsservice.service;

import com.jcoldsun.petsservice.dto.api.GetAllPetsResponse;
import com.jcoldsun.petsservice.dto.api.GetPetsByIdsResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PetService {

    GetAllPetsResponse getAllPets(Pageable pageable);

    GetPetsByIdsResponse getPetsByIds(List<Integer> ids);

}
