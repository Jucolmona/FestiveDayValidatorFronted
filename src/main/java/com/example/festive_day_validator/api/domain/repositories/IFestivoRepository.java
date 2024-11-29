package com.example.festive_day_validator.api.domain.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;

@Repository
public interface IFestivoRepository extends JpaRepository<FestivoEntity, Integer> {
    List<FestivoEntity> findAll();
    Optional<FestivoEntity> findById(Integer id);
    List<FestivoEntity> findByTypeFestive(String type);
}

