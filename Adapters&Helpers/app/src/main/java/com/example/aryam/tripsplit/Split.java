package com.example.aryam.tripsplit;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by aryam on 2/12/2018.
 */

public class Split {
    private FirebaseUser user;
    private Float owedAmount;
    private Float payedAmount;

    public Split(FirebaseUser user,Float owedAmount,Float payedAmount) {
        this.user = user;
        this.owedAmount = owedAmount;
        this.payedAmount = payedAmount;
            }

    public Float getOwedAmount() {
        return owedAmount;
    }

    public void setOwedAmount(Float owedAmount) {
        this.owedAmount = owedAmount;
    }


    public FirebaseUser getUser() {

        return user;
    }

    public void setUser(FirebaseUser user) {
        this.user = user;
    }

    public Float getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Float payedAmount) {
        this.payedAmount = payedAmount;
    }
}
