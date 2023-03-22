package com.rivera.propertymanagement.entity;

import jakarta.persistence.*;

/**
 * Created by Omar.Rivera on 21/3/23.
 *
 * @author Omar.Rivera
 */
@Entity
@Table(name = "ADDRESS_TABLE")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String city;
    private String postalCode;
    private String country;
    private String number;

    @OneToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

}
