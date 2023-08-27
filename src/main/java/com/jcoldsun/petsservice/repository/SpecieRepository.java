package com.jcoldsun.petsservice.repository;

import com.jcoldsun.petsservice.entity.SpecieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecieRepository extends JpaRepository<SpecieEntity, Integer> {
}
