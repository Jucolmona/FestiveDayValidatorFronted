package com.example.festive_day_validator.api.domain.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "festivo")
public class FestivoEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", length = 100, unique = true )
    private String name;

    @Column(name = "dia")
    private int day;

    @Column(name = "mes")
    private int month;

    @Column(name = "diapascua")
    private int pascuaDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipo")
    private TipoEntity type;



    public FestivoEntity() {
    }

    public FestivoEntity(String name, int day, int month, int pascuaDay, TipoEntity type){
        this.name = name;
        this.day = day;
        this.month = month;
        this.pascuaDay = pascuaDay;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getPascuaDay() {
        return pascuaDay;
    }

    public void setPascuaDay(int pascuaDay) {
        this.pascuaDay = pascuaDay;
    }

    public TipoEntity getType() {
        return type;
    }

    public void setType(TipoEntity type) {
        this.type = type;
    }

}
