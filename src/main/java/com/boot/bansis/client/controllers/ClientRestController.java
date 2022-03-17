package com.boot.bansis.client.controllers;

import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Company;
import com.boot.bansis.client.entities.Person;
import com.boot.bansis.client.services.CompanyService;
import com.boot.bansis.client.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
@RestController
@RequestMapping("/clients")
public class ClientRestController {

    @Autowired
    private PersonService personService;
    @Autowired
    private CompanyService companyService;

    @GetMapping("/personal/list")
    public Flux<Person> getAllPersons() {
        return personService.findAll();
    }

    @GetMapping("/personal/{id}")
    public Mono<Person> getPerson(@PathVariable String id) {
        return personService.findById(id);
    }

    @PostMapping("/personal/save")
    public Mono<Person> savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/personal/update/{id}")
    public Mono<PersonDto> updatePerson(@RequestBody Mono<PersonDto> personDtoMono, @PathVariable String id) {
        return personService.update(personDtoMono, id);
    }

    @DeleteMapping("/personal/delete/{id}")
    public Mono<Void> deletePerson(@PathVariable String id) {
        return personService.delete(id);
    }
    
    @GetMapping("/company/list")
    public Flux<Company> getAllCompanys() {
        return companyService.findAll();
    }

    @GetMapping("/company/{id}")
    public Mono<Company> getCompany(@PathVariable String id) {
        return companyService.findById(id);
    }
    
    @PostMapping("/company/save")
    public Mono<Company> savePerson(@RequestBody Company company) {
        return companyService.save(company);
    }

    @PutMapping("/company/update/{id}")
    public Mono<Company> updatePerson(@RequestBody Company company, @PathVariable String id) {
        return companyService.update(company, id);
    }

    @DeleteMapping("/company/delete/{id}")
    public Mono<Void> deleteCompany(@PathVariable String id) {
        return companyService.delete(id);
    }
}
