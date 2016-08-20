package com.musicstorewebsite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Le on 10/22/2015.
 */

@Entity
@Getter
@Setter
public class ShippingAddress implements Serializable{

    private static final long serialVersionUID = 8172069163266137178L;

    @Id
    @GeneratedValue
    private int shippingAddressId;
    private String streetName;
    private String apartmentNumber;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @OneToOne
    private Customer customer;

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "shippingAddressId=" + shippingAddressId +
                ", streetName='" + streetName + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", customer=" + customer +
                '}';
    }
}
