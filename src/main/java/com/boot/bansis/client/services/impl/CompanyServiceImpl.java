package com.boot.bansis.client.services.impl;

import com.boot.bansis.client.dto.CompanyDto;
import com.boot.bansis.client.entities.Company;
import com.boot.bansis.client.repositories.CompanyRepository;
import com.boot.bansis.client.services.CompanyService;
import com.boot.bansis.client.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyDao;

    @Override
    public Flux<Company> findAll() {
        return companyDao.findAll();
    }

    @Override
    public Mono<Company> findById(String id) {
        return companyDao.findById(id);
    }

    /* Unused methods
    @Override
    public Mono<Company> save(Company company) {
        return companyDao.save(company);
    }

    @Override
    public Mono<Company> update(Company company, String id) {
        return companyDao.findById(id)
                .map(p -> company)
                .doOnNext(e -> e.setId(id))
                .flatMap(companyDao::save);
    }
     */
    @Override
    public Mono<CompanyDto> save(Mono<CompanyDto> companyDtoMono) {
        return companyDtoMono.map(Utils::dtoToEntity)
                .flatMap(companyDao::insert)
                .map(Utils::entityToDto);
    }

    @Override
    public Mono<CompanyDto> update(Mono<CompanyDto> companyDtoMono, String id) {
        return companyDao.findById(id)
                .flatMap(p -> companyDtoMono.map(Utils::dtoToEntity)
                .doOnNext(e -> e.setId(id))
                .doOnNext(e -> e.setCreatedAt(p.getCreatedAt())))
                .flatMap(companyDao::save)
                .map(Utils::entityToDto);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return companyDao.deleteById(id);
    }

    @Override
    public Flux<Company> findByPymeTrue() {
        return companyDao.findByPymeTrue();
    }

}
