package com.vrishankgupta.chatting;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.vrishankgupta.chatting.util.MarketItems;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {
    ListView lvMarket;
       public static ArrayList<MarketItems> list = new ArrayList<>();
        adapter a = new adapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        lvMarket = (ListView) findViewById(R.id.lvMarket);

        int i=0;
        MarketItems items = new MarketItems();
        items.setName("Mat White");
        items.setCost(100);
        items.setId(i++);
        items.setQuantity(28);
        items.setMakerName("Rahul Sharma");
        items.setDescription("A white coloured simple mat made by Rahul Sharma, a scholar of Sab Ki Pathshala.\nMaterial used:- Jute");
        items.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.mat));

        list.add(items);

        MarketItems items1 = new MarketItems();

        items1.setName("Mat Colour");
        items1.setCost(150);
        items1.setQuantity(32);
        items1.setId(i++);
        items1.setMakerName("Nidhi Singh");
        items1.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.colored_mat));
        list.add(items1);


        MarketItems items2 = new MarketItems();

        items2.setName("Diya");
        items2.setCost(50);
        items2.setId(i++);
        items2.setQuantity(12);
        items2.setMakerName("Nihar Singh");
        items2.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.diya));
        list.add(items2);

        MarketItems items3 = new MarketItems();
        items3.setName("Bag Purple");
        items3.setCost(200);
        items3.setQuantity(43);
        items3.setId(i++);
        items3.setMakerName("Aman");
        items3.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.bag));
        list.add(items3);

        MarketItems items4 = new MarketItems();
        items4.setName("Bag Blue");
        items4.setCost(180);
        items4.setQuantity(10);
        items4.setId(i++);
        items4.setMakerName("Shivam");
        items4.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.bag2));
        list.add(items4);


        MarketItems items5 = new MarketItems();
        items5.setName("Bag Brown");
        items5.setCost(190);
        items5.setId(i);
        items5.setQuantity(23);
        items5.setMakerName("Nidhi Singh");
        items5.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.bag3));
        list.add(items5);

        lvMarket.setAdapter(a);

        lvMarket.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MarketActivity.this,MarketDescription.class);
                intent.putExtra("Type", i);
                startActivity(intent);
            }
        });

    }



    class adapter extends BaseAdapter
    {
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public MarketItems getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View itemView = layoutInflater.inflate(R.layout.market_card,viewGroup,false);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.ivCard);
            TextView name = (TextView) itemView.findViewById(R.id.cardItemName);
            TextView cost = (TextView) itemView.findViewById(R.id.cardCost);

            MarketItems thisItem = getItem(i);

            imageView.setImageBitmap(thisItem.getImage());
            name.setText(thisItem.getName());
            cost.setText("Rs:-"+thisItem.getCost()+"");

            return itemView;
        }
    }
}
