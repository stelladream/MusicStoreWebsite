package com.musicstorewebsite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ldeng on 1/18/2016.
 */

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue
    private int usersId;
    private String username;
    private String password;
    private boolean enabled;
    private int customerId;

}
