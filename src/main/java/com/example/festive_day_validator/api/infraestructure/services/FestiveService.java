package com.example.festive_day_validator.api.infraestructure.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.repositories.ITipoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@Service
public class FestiveService implements IFestivoService{
    
    private static final Logger logger = LoggerFactory.getLogger(FestiveService.class);

    @Autowired
    private IFestivoRepository festivoRepository;

    @Autowired
    private ITipoRepository tipoRepository;

    public FestiveService(){}

    public FestiveService(IFestivoRepository fr, ITipoRepository tr){
        this.festivoRepository = fr;
        this.tipoRepository = tr;
    }

    @Override
    public List<FestivoEntity> listFestiveDays() {
        logger.info("Fetching all festive days");
        List<FestivoEntity> festivos = festivoRepository.findAll();
        logger.info("Found {} festive days", festivos.size());
        return festivos;
    }
}
