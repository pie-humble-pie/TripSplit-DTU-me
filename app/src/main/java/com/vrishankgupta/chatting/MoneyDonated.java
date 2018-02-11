package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MoneyDonated extends AppCompatActivity {

    CardView cvCreditCard , cvDebitCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_donated);

        cvCreditCard = (CardView) findViewById(R.id.cvCreditCard);
        cvDebitCard = (CardView) findViewById(R.id.cvDebitCard);

        cvCreditCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MoneyDonated.this , PaymentGateWayActivity.class);
                startActivity(j);
            }
        });

        cvDebitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MoneyDonated.this , PaymentGateWayActivity.class);
                startActivity(j);
            }
        });
    }
}
