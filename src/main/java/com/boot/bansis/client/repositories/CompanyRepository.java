package com.boot.bansis.client.repositories;

import com.boot.bansis.client.entities.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Demn
 */
@Repository
public interface CompanyRepository extends ReactiveMongoRepository<Company, String> {
    
}
