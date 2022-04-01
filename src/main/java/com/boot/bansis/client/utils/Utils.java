package com.boot.bansis.client.utils;

import com.boot.bansis.client.dto.CompanyDto;
import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Company;
import com.boot.bansis.client.entities.Person;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author rDelgC
 */
public class Utils {

    // Person utils
    public static PersonDto entityToDto(Person person) {
        PersonDto personDto = new PersonDto();
        BeanUtils.copyProperties(person, personDto);
        return personDto;
    }

    public static Person dtoToEntity(PersonDto personDto) {
        Person person = new Person();
        BeanUtils.copyProperties(personDto, person);
        return person;
    }

    // Company utils
    public static CompanyDto entityToDto(Company company) {
        CompanyDto companyDto = new CompanyDto();
        BeanUtils.copyProperties(company, companyDto);
        return companyDto;
    }

    public static Company dtoToEntity(CompanyDto companyDto) {
        Company company = new Company();
        BeanUtils.copyProperties(companyDto, company);
        return company;
    }

}
