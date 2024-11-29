package com.example.festive_day_validator.api.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo")
public class TipoEntity {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="tipo", length=100, unique=true)
    private String festive;

    public TipoEntity(){
    }

    /* ---- Constructor --- */
    public TipoEntity(String type){
        this.festive = type;
    }

    /* ---- Getters and Setters definition --- */
    public int getId() {
        return id;
    }

    public String getType() {
        return this.festive;
    }

    public void setType(String type) {
        this.festive = type;
    }
}
