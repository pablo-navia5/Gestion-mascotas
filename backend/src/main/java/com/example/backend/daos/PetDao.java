package com.example.backend.daos;

import com.example.backend.models.PetModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDao extends MongoRepository<PetModel, String> {
}
