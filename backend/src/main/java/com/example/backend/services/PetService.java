package com.example.backend.services;

import com.example.backend.models.PetModel;

import java.util.List;
import java.util.Optional;

public interface PetService {

    List<PetModel> findAll();

    Optional<PetModel> findById(String id);

    List<PetModel> findByName(String name);

    void deleteById(String id);

    PetModel save(PetModel petModel);
}
