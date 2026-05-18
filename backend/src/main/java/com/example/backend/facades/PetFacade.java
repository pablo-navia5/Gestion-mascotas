package com.example.backend.facades;

import com.example.backend.dtos.PetDto;
import com.example.backend.models.PetModel;

import java.util.List;
import java.util.Optional;

public interface PetFacade {

    List<PetDto> findAll();

    Optional<PetDto> findById(String id);

    List<PetDto> findByName(String name);

    void deleteById(String id);

    PetDto save(PetDto petDto);
}
