package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")

public class Categoria implements Serializable {  //Serializacion funciona para almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //Para poder hacer el ciclo de la sumatoria del idCategoria
    
    @Id //La tabla categoria tiene una llave o identificador que va a ser el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Los valores generados que tipo de extrategia utilizan, identico = sea igual en la BD y en la clase
    @Column(name = "id_categoria") // Decir cual es el nombre de la columna en la base de datos
    private long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    

    
}
