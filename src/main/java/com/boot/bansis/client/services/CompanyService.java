package com.boot.bansis.client.services;

import com.boot.bansis.client.dto.CompanyDto;
import com.boot.bansis.client.entities.Company;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public interface CompanyService {

    public Flux<CompanyDto> findAll();

    public Mono<CompanyDto> findById(String id);

    /* Unused methods
    public Mono<Company> save(Company company);

    public Mono<Company> update(Company company, String id);
     */
    public Mono<CompanyDto> save(Mono<CompanyDto> companyDtoMono);

    public Mono<CompanyDto> update(Mono<CompanyDto> companyDtoMono, String id);

    public Mono<Void> deleteById(String id);

    public Flux<CompanyDto> findByPymeTrue();

}
