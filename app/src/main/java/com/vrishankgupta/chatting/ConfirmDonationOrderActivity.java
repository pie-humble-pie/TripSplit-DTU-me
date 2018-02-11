package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConfirmDonationOrderActivity extends AppCompatActivity {

    Button btnContinue02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_donation_order);

        btnContinue02 = (Button) findViewById(R.id.btnContinue02);

        btnContinue02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j =new Intent(ConfirmDonationOrderActivity.this , ThankYouActivity.class);
                startActivity(j);
            }
        });
    }
}
