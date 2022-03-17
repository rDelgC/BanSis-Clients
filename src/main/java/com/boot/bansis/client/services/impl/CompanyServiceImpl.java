package com.boot.bansis.client.services.impl;

import com.boot.bansis.client.entities.Company;
import com.boot.bansis.client.repositories.CompanyRepository;
import com.boot.bansis.client.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
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

    @Override
    public Mono<Void> delete(String id) {
        return companyDao.deleteById(id);
    }

}
