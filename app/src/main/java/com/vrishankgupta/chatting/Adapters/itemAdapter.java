package com.vrishankgupta.chatting.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.vrishankgupta.chatting.Models.Items;
import com.vrishankgupta.chatting.R;

import java.util.ArrayList;

/**
 * Created by Shivam Gupta on 10-02-2018.
 */

public class itemAdapter extends BaseAdapter {

    ArrayList<Items> itemList;
    Context context;

    public itemAdapter(ArrayList<Items> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Items getItem(int i) {
        return itemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
         view = li.inflate(R.layout.listitemforproducts , parent , false);

         final Items currentItem = itemList.get(i);

        ((TextView)view.findViewById(R.id.tvItemName)).setText(currentItem.getItemName());

        Button btnAdd = (Button) view.findViewById(R.id.btnAdd);
        Button btnSubtract = (Button) view.findViewById(R.id.btnSubtract);
        final TextView tvDisplay = (TextView) view.findViewById(R.id.tvDisplay);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(tvDisplay.getText().toString());
                x++;
                tvDisplay.setText(x + "");
                currentItem.setQuantity(x);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.valueOf(tvDisplay.getText().toString());
                if( x> 0) {
                    x--;
                    tvDisplay.setText(x + "");
                    currentItem.setQuantity(x);
                }
            }
        });

        ImageView ivImage = (ImageView) view.findViewById(R.id.ivImage);

        ivImage.setImageResource(currentItem.getImageid());

        return view;
    }
}
