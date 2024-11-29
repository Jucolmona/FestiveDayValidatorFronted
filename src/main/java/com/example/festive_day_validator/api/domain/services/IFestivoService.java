package com.example.festive_day_validator.api.domain.services;

import java.util.List;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;

public interface IFestivoService {
    
    public List<FestivoEntity> listFestiveDays();
    
}