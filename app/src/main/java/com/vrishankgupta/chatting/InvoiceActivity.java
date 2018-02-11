package com.vrishankgupta.chatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.vrishankgupta.chatting.util.MarketItems;

public class InvoiceActivity extends AppCompatActivity {
    TextView tvName,tvCost,tvQuantity;
    ImageView imageView;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
        tvName = (TextView) findViewById(R.id.cartName);
        tvCost = (TextView) findViewById(R.id.cost);
        tvQuantity = (TextView) findViewById(R.id.quantity);
        imageView = (ImageView) findViewById(R.id.ivItem);
        proceed = (Button) findViewById(R.id.proceed);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InvoiceActivity.this,MoneyDonated.class));
            }
        });


        int i = getIntent().getExtras().getInt("Cost");
        MarketItems items = MarketActivity.list.get(i);
        imageView.setImageBitmap(items.getImage());
        tvQuantity.setText(items.getQuantity() +" Items");
        tvCost.setText("Total Cost " +items.getCost() * items.getQuantity());
    }
}
