package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
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
@Document
public class Company {
    @Id
    private String id;
    
    @Field("business_name")
    private String businessName;
    
    @Field("ruc")
    private String ruc;
    
    @Field("email")
    private String email;
    
    @Field("address")
    private Address address;
}
