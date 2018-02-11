package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


import com.vrishankgupta.chatting.Models.Items;
import com.vrishankgupta.chatting.Models.items02;
import com.vrishankgupta.chatting.Adapters.itemAdapter;

import java.util.ArrayList;

public class DonationActivity extends AppCompatActivity {

    ListView lvItems;
    ArrayList<Items> itemsList = new ArrayList<>();
    itemAdapter itemAdapter = new itemAdapter (itemsList, DonationActivity.this );
    Button btnMoneyDonated , btnDonate;
    ArrayList<items02> confirmedItemList = new ArrayList<>();
    int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        btnMoneyDonated = (Button) findViewById(R.id.btnDonateMoney);
        btnDonate = (Button) findViewById(R.id.btnDonate);

        lvItems = (ListView) findViewById(R.id.lvItems);

        itemsList.add(new Items("Bench" , R.drawable.benchstudent));
        itemsList.add(new Items("Books" , R.drawable.books));
        itemsList.add(new Items("Book Shelf" , R.drawable.bookshelf));
        itemsList.add(new Items("ChalkBoard" , R.drawable.chalkboard));
        itemsList.add(new Items("Stationary" , R.drawable.stationery));
        itemsList.add(new Items("Computer" , R.drawable.computer));

        lvItems.setAdapter(itemAdapter);

        btnMoneyDonated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(DonationActivity.this ,MoneyDonated.class);
                startActivity(j);
            }
        });

        btnDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0 ; i<itemsList.size() ; i++){

                    if(itemsList.get(i).getQuantity() > 0){
                        Integer y = itemsList.get(i).getQuantity();
                        confirmedItemList.add(new items02(itemsList.get(i).getItemName() , itemsList.get(i).getQuantity() ,
                                itemsList.get(i).getImageid()));
                        count++;
                    }
                }

                if(confirmedItemList.size() == 0){
                    Toast.makeText(DonationActivity.this, "Please Select Some Quantity ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent j = new Intent(DonationActivity.this, DonateItemFromListActivity.class);
                    j.putExtra("arraylist", confirmedItemList);
                    startActivity(j);
                }
            }
        });

    }

    @Override
    protected void onPostResume() {
        confirmedItemList.clear();
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        confirmedItemList.clear();
        super.onRestart();
    }
}
