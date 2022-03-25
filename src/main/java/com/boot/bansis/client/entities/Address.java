package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Field("description")
    private String description;

    @Field("post_code")
    private String postCode;

}
