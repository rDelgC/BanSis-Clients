package com.boot.bansis.client.dto;

import com.boot.bansis.client.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Demn
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private String id;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String email;
    private Address address;
}
