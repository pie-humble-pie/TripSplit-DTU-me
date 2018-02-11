package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class OTPActivity extends AppCompatActivity {

    Button btnConfirm01;
    EditText etOTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        final Handler h = new Handler();

        btnConfirm01 = (Button) findViewById(R.id.btnConfirm01);
        etOTP = (EditText) findViewById(R.id.etOTP);

        long time = System.currentTimeMillis();
       while(System.currentTimeMillis() - time <6500);
                Toast.makeText(OTPActivity.this, "Auto-Verifying OTP", Toast.LENGTH_SHORT).show();

        while(System.currentTimeMillis() - time <1000);
        etOTP.setText("******");

        btnConfirm01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Intent j = new Intent(OTPActivity.this , ThankYouActivity.class);
                        startActivity(j);
            }
        });
    }
}
