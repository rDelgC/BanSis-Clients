package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "companys")
public class Company extends Client {

    @Field("business_name")
    private String businessName;

    @Field("ruc")
    private String ruc;

    @Field("pyme")
    private boolean pyme;
}
