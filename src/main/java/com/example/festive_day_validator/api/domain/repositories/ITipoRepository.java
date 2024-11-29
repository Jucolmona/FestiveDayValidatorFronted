package com.example.festive_day_validator.api.domain.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.festive_day_validator.api.domain.entities.TipoEntity;

@Repository
public interface ITipoRepository extends JpaRepository<TipoEntity, Integer> {
    List<TipoEntity> findAll();
    Optional<TipoEntity> findById(Integer id);
}
