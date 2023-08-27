package com.jcoldsun.petsservice.api.rest;

import com.jcoldsun.petsservice.dto.api.GetAllSpeciesResponse;
import com.jcoldsun.petsservice.service.SpecieService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/species")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SpecieRestController {
    SpecieService specieService;

    @GetMapping
    public ResponseEntity<GetAllSpeciesResponse> getAll() {
        return ResponseEntity.ok(specieService.getAll());
    }

}
