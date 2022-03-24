package com.boot.bansis.client.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
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
@Document(collection = "companys")
public class Company {

    @Id
    private String id;

    @Field("business_name")
    private String businessName;

    @Field("ruc")
    private String ruc;

    @Field("phone_number")
    private String phoneNumber;
    
    @Field("mobile_number")
    private String mobileNumber;

    @Field("email")
    private String email;

    @Field("pyme")
    private boolean pyme;

    @Field("address")
    private Address address;
    
    @Field("created_at")
    @CreatedDate
    private Date createdAt;
}
