package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelg
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "people")
public class Person extends Client {

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("gender")
    private Gender gender;

    @Field("id_number")
    private String idNumber;

    @Field("vip")
    private boolean vip;

}
