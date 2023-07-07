/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoG05.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

/**
 *
 * @author Jose Daniel
 */

@Entity
@Table(name="Tiquete",uniqueConstraints=@UniqueConstraint(columnNames="Título"))
public class Tiquete {
    
    //Creamos los atributos de la clase segun los datos del SQL DB
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_tiquete")
    private Long idTiquete;
    
    @Column(name="Estado_tiquete")
    private String Estado;
    
    @Column(name="Descripción ")
    private String Descripción;
    
    private String Título;
    private String Edad;

    public Long getIdTiquete() {
        return idTiquete;
    }

    public String getEstado() {
        return Estado;
    }

    public String getDescripción() {
        return Descripción;
    }

    public String getTítulo() {
        return Título;
    }

    public String getEdad() {
        return Edad;
    }

    public Tiquete(Long idTiquete, String Estado, String Descripción, String Título, String Edad) {
        this.idTiquete = idTiquete;
        this.Estado = Estado;
        this.Descripción = Descripción;
        this.Título = Título;
        this.Edad = Edad;
    }

    public Tiquete(String Estado, String Descripción, String Título, String Edad) {
        this.Estado = Estado;
        this.Descripción = Descripción;
        this.Título = Título;
        this.Edad = Edad;
    }
   
    public Tiquete (){}

}


