package com.jcoldsun.petsservice.dto.api;

import com.jcoldsun.petsservice.dto.SpecieDto;

import java.util.List;

public record GetAllSpeciesResponse(List<SpecieDto> species) {
}
