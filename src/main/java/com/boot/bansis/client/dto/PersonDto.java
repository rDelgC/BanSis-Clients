package com.boot.bansis.client.dto;

import com.boot.bansis.client.entities.Address;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;
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
    private String phoneNumber;
    private String mobileNumber;
    private String email;
    private boolean isVip;
    private Address address;
    private Date createdAt;
}
