package com.example.festive_day_validator.api.infraestructure.repositories;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class FestivoRepositoryImpl extends SimpleJpaRepository<FestivoEntity, Integer> implements IFestivoRepository {

    private static final Logger logger = LoggerFactory.getLogger(FestivoRepositoryImpl.class);

    @PersistenceContext
    private EntityManager entityManager;
    
    public FestivoRepositoryImpl(EntityManager em){
        super(FestivoEntity.class, em);
        this.entityManager = em;
    }

    @Override
    public List<FestivoEntity> findByTypeFestive(String type) {

        logger.info("Fetching festivos by type: {}", type);

        String queryStr = "SELECT f FROM FestivoEntity f WHERE f.type.name = :type";
        TypedQuery<FestivoEntity> query = entityManager.createNamedQuery(queryStr, FestivoEntity.class);
        query.setParameter("type", type);

        List<FestivoEntity> result = query.getResultList();
        logger.info("Found {} festivos for type: {}", result.size(), type);

        return result;
    }
}
