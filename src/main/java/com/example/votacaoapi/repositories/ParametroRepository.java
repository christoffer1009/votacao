package com.example.votacaoapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.votacaoapi.models.ParametroModel;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
    
}
