package com.jcoldsun.petsservice.api.rest;

import com.jcoldsun.petsservice.dto.api.GetAllPetsResponse;
import com.jcoldsun.petsservice.dto.api.GetPetsByIdsResponse;
import com.jcoldsun.petsservice.service.PetService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pets")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PetRestController {
    PetService petService;

    @GetMapping
    public ResponseEntity<GetAllPetsResponse> getAllPets(@PageableDefault(size = 25) Pageable pageable) {
        return ResponseEntity.ok(petService.getAllPets(pageable));
    }

    @GetMapping("/{ids}")
    public ResponseEntity<GetPetsByIdsResponse> getPetsByIds(@PathVariable List<Integer> ids) {
        return ResponseEntity.ok(petService.getPetsByIds(ids));
    }

}
