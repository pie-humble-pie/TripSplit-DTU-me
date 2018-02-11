package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.vrishankgupta.chatting.Models.items02;

import java.util.ArrayList;

public class DonateItemFromListActivity extends AppCompatActivity {

    ListView lvConfirmedItems;
    CardView cvConfirmDonation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_item_from_list);

        cvConfirmDonation = (CardView) findViewById(R.id.cvConfirmDonation);

        lvConfirmedItems = (ListView) findViewById(R.id.lvConfirmeditems);

        ArrayList<items02> filelist = (ArrayList<items02>) getIntent().getSerializableExtra("arraylist");

        Adapter confirmedItemsAdapter = new Adapter(filelist);

        lvConfirmedItems.setAdapter(confirmedItemsAdapter);

        cvConfirmDonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(DonateItemFromListActivity.this , ConfirmDonationOrderActivity.class);
                startActivity(j);
            }
        });

    }

    class Adapter extends BaseAdapter {
        ArrayList<items02> fileList = new ArrayList<>();

        public Adapter(ArrayList<items02> fileList) {
            this.fileList = fileList;
        }

        @Override
        public int getCount() {
            return fileList.size();
        }

        @Override
        public items02 getItem(int i) {
            return fileList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li = getLayoutInflater();
            view = li.inflate(R.layout.confirmeditemslistrowelement , viewGroup , false);

            items02 currentItem = fileList.get(i);

            ( (TextView) view.findViewById(R.id.tvbhenchod)).setText(currentItem.getQuantity() + "");
            ((TextView) view.findViewById(R.id.tvItemName)).setText(currentItem.getName());

            ImageView imageview02 = (ImageView) view.findViewById(R.id.ivImage01);

            imageview02.setImageResource(currentItem.getImageid());
            return view;
        }
    }
}
