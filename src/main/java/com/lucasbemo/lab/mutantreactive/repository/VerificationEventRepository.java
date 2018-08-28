package com.lucasbemo.lab.mutantreactive.repository;

import com.lucasbemo.lab.mutantreactive.entity.VerificationEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author lucasbemo
 */
public interface VerificationEventRepository extends MongoRepository<VerificationEvent, String> {


}
