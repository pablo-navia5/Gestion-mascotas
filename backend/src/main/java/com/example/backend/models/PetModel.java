package com.example.backend.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pets")
public class PetModel {

    @Id
    private String id;

    @NotBlank(message = "El nombre de la mascota no puede estar vacío")
    private String name;

    @NotBlank(message = "Debes especificar la especie (ej: Perro, Gato)")
    private String species;

    @Min(value = 0, message = "La edad no puede ser un número negativo")
    private int age;

    private double weight;
}
