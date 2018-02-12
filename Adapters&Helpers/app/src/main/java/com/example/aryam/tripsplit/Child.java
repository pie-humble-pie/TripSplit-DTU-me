package com.example.aryam.tripsplit;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by aryam on 2/13/2018.
 */

public class Child extends Split {
    public Child(FirebaseUser user, Float owedAmount, Float payedAmount) {
        super(user, owedAmount, payedAmount);
    }
}
