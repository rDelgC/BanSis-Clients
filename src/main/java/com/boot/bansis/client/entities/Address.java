/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boot.bansis.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author Demn
 */
@Getter
@Setter
@AllArgsConstructor
public class Address {

    @Id
    private String id;

    @Field("desc")
    private String description;

    @Field("post_code")
    private String postCode;

}
