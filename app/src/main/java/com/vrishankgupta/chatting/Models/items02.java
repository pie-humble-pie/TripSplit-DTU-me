package com.vrishankgupta.chatting.Models;

import java.io.Serializable;

/**
 * Created by Shivam Gupta on 10-02-2018.
 */

public class items02 implements Serializable {
    String name;
    int quantity;
    Integer imageid;

    public items02(String name, int quantity, Integer imageid) {
        this.name = name;
        this.quantity = quantity;
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageid() {
        return imageid;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
