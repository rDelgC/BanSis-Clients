package com.boot.bansis.client.dto;

import com.boot.bansis.client.entities.Address;
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
public class CompanyDto {

    private String id;
    private String businessName;
    private String ruc;
    private String phoneNumber;
    private String mobileNumber;
    private String email;
    private boolean pyme;
    private Address address;
    private char status;
    private Date createdAt;
    private Date updatedAt;

}
