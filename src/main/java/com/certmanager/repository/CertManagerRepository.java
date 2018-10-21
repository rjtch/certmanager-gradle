package com.certmanager.repository;

import java.util.Optional;

import com.certmanager.model.Cert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CertManagerRepository extends MongoRepository<Cert, String>{
    Optional<Cert> findById(String _id);
}