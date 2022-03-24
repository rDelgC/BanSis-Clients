package com.boot.bansis.client.services;

import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Company;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
public interface CompanyService {

    public Flux<Company> findAll();

    public Mono<Company> findById(String id);

    public Mono<Company> save(Company company);

    public Mono<Company> update(Company company, String id);

    public Mono<Void> delete(String id);

    public Flux<Company> findByPymeTrue();
    
}
