package com.rivera.propertymanagement.entity;

import jakarta.persistence.*;

/**
 * Created by Omar.Rivera on 15/3/23.
 *
 * @author Omar.Rivera
 */
@Entity
@Table(name = "PROPERTY_TABLE")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="TITLE", nullable = false)
    private String title;
    private String ownerName;

    @Column(name="EMAIL", nullable = false)
    private String ownerEmail;

    private String description;
    private Double price;
    private String address;

    @ManyToOne(fetch =  FetchType.LAZY) // It will not fetch the user data while fetching property
    @JoinColumn(name="USER_ID", nullable = false)
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }
}
