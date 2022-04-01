package com.boot.bansis.client.services.impl;

import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Person;
import com.boot.bansis.client.repositories.PersonRepository;
import com.boot.bansis.client.services.PersonService;
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
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personDao;

    @Override
    public Flux<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Mono<Person> findById(String id) {
        return personDao.findById(id);
    }

    @Override
    public Mono<PersonDto> save(Mono<PersonDto> personDtoMono) {
        return personDtoMono.map(Utils::dtoToEntity)
                .flatMap(personDao::insert)
                .map(Utils::entityToDto);
    }

    /* Unused method
    @Override
    public Mono<Person> save(Person person) {
        return personDao.save(person);
    }
     */
    @Override
    public Mono<PersonDto> update(Mono<PersonDto> personDtoMono, String id) {
        return personDao.findById(id)
                .flatMap(p -> personDtoMono.map(Utils::dtoToEntity)
                .doOnNext(e -> e.setId(id))
                .doOnNext(e -> e.setCreatedAt(p.getCreatedAt())))
                .flatMap(personDao::save)
                .map(Utils::entityToDto);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return personDao.deleteById(id);
    }

    @Override
    public Flux<Person> findByVipTrue() {
        return personDao.findByVipTrue();
    }

}
