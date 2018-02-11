package com.vrishankgupta.chatting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.vrishankgupta.chatting.util.MarketItems;

import java.util.ArrayList;

public class MarketDescription extends AppCompatActivity {
    ImageView image,plus,minus;
    CardView cvAddToCart;
    TextView desc,cost,left,quantity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_description);

        cvAddToCart = (CardView) findViewById(R.id.cvAddToCart);

        final int i = getIntent().getExtras().getInt("Type");

        final MarketItems items = MarketActivity.list.get(i);

        image = (ImageView) findViewById(R.id.descImage);
        plus = (ImageView) findViewById(R.id.add);
        minus = (ImageView) findViewById(R.id.minus);
        desc = (TextView) findViewById(R.id.desc);
        cost = (TextView) findViewById(R.id.cost);
        left = (TextView) findViewById(R.id.left);
        quantity = (TextView) findViewById(R.id.quantity);


        desc.setText(items.getDescription());
        cost.setText(items.getCost()+"");
        left.setText(items.getQuantity()+"");
        image.setImageBitmap(items.getImage());

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( Integer.valueOf(left.getText().toString())>0)
                {
                    int x = Integer.valueOf(quantity.getText().toString());
                    x++;
                    quantity.setText(x+"");
                    items.setQuantity(Integer.valueOf(quantity.getText().toString()));
                    int y = Integer.valueOf(left.getText().toString());
                    y--;
                    left.setText(y+"");
                }
                else
                    Toast.makeText(MarketDescription.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.valueOf(quantity.getText().toString())>0 && Integer.valueOf(left.getText().toString())>0) {
                    int x = Integer.valueOf(quantity.getText().toString());
                    x--;
                    quantity.setText(x + "");
                    items.setQuantity(Integer.valueOf(quantity.getText().toString()));

                    int y = Integer.valueOf(left.getText().toString());
                    y++;

                    left.setText(y + "");
                }

                else Toast.makeText(MarketDescription.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        cvAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MarketDescription.this , InvoiceActivity.class);
                j.putExtra("Cost",i);
                startActivity(j);
            }
        });

    }
}
