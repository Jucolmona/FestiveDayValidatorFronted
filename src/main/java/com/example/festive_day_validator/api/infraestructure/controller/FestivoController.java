package com.example.festive_day_validator.api.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@RestController
@RequestMapping("/festivos")
public class FestivoController {
    @Autowired
    private IFestivoService festivoService;

    @Autowired
    private IFestivoRepository festivoRepository;


    @GetMapping("/festivo")
    public ResponseEntity<List<FestivoEntity>> listFestivos() {
        List<FestivoEntity> festivos = festivoService.listFestiveDays();
        return ResponseEntity.ok(festivos);
    }
    
    @GetMapping("/festivo/tipo")
    public ResponseEntity<List<FestivoEntity>> findByType(@RequestParam(name="tipo") String type) {
        List<FestivoEntity> festivos = festivoRepository.findByTypeFestive(type);
        return ResponseEntity.ok(festivos);
    }
}
