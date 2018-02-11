package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaymentGateWayActivity extends AppCompatActivity {


    Button btnContinue01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_gate_way);

        btnContinue01 = (Button) findViewById(R.id.btnContinue01);

        btnContinue01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(PaymentGateWayActivity.this ,
                        OTPActivity.class);
                startActivity(j);
            }
        });
    }
}
