package com.boot.bansis.client.repositories;

import com.boot.bansis.client.entities.Company;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 *
 * @author rDelgC
 */
@Repository
public interface CompanyRepository extends ReactiveMongoRepository<Company, String> {

    public Flux<Company> findByPymeTrue();

}
