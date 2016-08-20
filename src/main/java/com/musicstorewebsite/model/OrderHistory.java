package com.musicstorewebsite.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by ldeng on 1/22/2016.
 */

@Entity
@Getter
@Setter
public class OrderHistory implements Serializable {

    private static final long serialVersionUID = 1083533250613139445L;

    @Id
    @GeneratedValue
    private int orderHistoryId;
    private int customerId;
    private String customerName;
    private int customerOrderId;
    private int cartId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "cartItem_orderHistory", joinColumns = @JoinColumn(name = "orderHistoryId"),
            inverseJoinColumns = @JoinColumn
                    (name = "cartItemId"))
    private List<CartItem> cartItems = new ArrayList<CartItem>();
    private double grandTotal;
    private String billingAddress;
    private String shippingAddress;

}
