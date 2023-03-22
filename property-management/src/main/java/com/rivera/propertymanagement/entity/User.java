package com.rivera.propertymanagement.entity;

import jakarta.persistence.*;

/**
 * Created by Omar.Rivera on 21/3/23.
 *
 * @author Omar.Rivera
 */
@Entity
@Table(name = "USER_TABLE")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="USER_NAME", nullable = false)
    private String username;

    @Column(name="EMAIL", nullable = false)
    private String email;

    private String password;
}
