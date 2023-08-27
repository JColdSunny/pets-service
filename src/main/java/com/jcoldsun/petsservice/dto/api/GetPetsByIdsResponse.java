package com.jcoldsun.petsservice.dto.api;

import com.jcoldsun.petsservice.dto.PetDto;

import java.util.List;

public record GetPetsByIdsResponse(List<PetDto> pets) {
}
