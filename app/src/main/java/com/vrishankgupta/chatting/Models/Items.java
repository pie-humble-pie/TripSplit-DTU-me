package com.vrishankgupta.chatting.Models;

/**
 * Created by Shivam Gupta on 10-02-2018.
 */

public class Items {
    String itemName;
    int quantity = 0;
    Integer imageid;

    public Items(String itemName, Integer imageid) {
        this.itemName = itemName;
        this.imageid = imageid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public Integer getImageid() {
        return imageid;
    }
}
