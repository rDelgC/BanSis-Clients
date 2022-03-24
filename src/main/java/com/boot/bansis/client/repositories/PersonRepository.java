package com.boot.bansis.client.repositories;

import com.boot.bansis.client.entities.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 *
 * @author Demn
 */
@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

    public Flux<Person> findByVipTrue();

}
