package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OTPActivity extends AppCompatActivity {

    Button btnConfirm01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        btnConfirm01 = (Button) findViewById(R.id.btnConfirm01);

        btnConfirm01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(OTPActivity.this , ThankYouActivity.class);
                startActivity(j);
            }
        });
    }
}
