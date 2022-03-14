package com.boot.bansis.client.utils;

import com.boot.bansis.client.dto.PersonDto;
import com.boot.bansis.client.entities.Person;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author Demn
 */
public class Utils {

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
}
