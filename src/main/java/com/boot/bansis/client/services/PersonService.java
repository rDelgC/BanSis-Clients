package com.boot.bansis.client.services;

import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public interface PersonService {

    public Flux<Person> findAll();

    public Mono<Person> findById(String id);

    public Mono<PersonDto> save(Mono<PersonDto> personDtoMono);

    public Mono<Person> save(Person person);

    public Mono<PersonDto> update(Mono<PersonDto> personDtoMono, String id);

    public Mono<Void> delete(String id);

    public Flux<Person> findByVipTrue();

}
