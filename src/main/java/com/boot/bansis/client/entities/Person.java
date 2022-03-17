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
@Document(collection = "persons")
public class Person {

    @Id
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("id_number")
    private String idNumber;

    @Field("phone_number")
    private String phoneNumber;
    
    @Field("mobile_number")
    private String mobileNumber;

    @Field("email")
    private String email;

    @Field("is_vip")
    private boolean isVip;

    @Field("address")
    private Address address;
    
    @Field("created_at")
    @CreatedDate
    private Date createdAt;
}
