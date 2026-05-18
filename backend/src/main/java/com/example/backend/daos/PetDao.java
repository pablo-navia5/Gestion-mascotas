package com.example.backend.daos;

import com.example.backend.models.PetModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetDao extends MongoRepository<PetModel, String> {

    List<PetModel> findByNameContainingIgnoreCase(String name);
}
