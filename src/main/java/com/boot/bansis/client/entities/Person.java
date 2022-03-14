package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author Demn
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Person {

    @Id
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("id_number")
    private String idNumber;

    @Field("email")
    private String email;

    @Field("address")
    private Address address;
}
