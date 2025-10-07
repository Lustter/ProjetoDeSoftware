package com.example.CronogramaRMD.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cronogramas")
@Entity(name = "Cronograma")
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Cronograma {

    @Id @GeneratedValue





}
