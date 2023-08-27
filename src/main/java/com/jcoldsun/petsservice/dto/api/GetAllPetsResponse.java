package com.jcoldsun.petsservice.dto.api;

import com.jcoldsun.petsservice.dto.PetDto;
import org.springframework.data.domain.Page;

public record GetAllPetsResponse(Page<PetDto> pets) {
}
