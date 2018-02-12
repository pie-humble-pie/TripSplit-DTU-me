package com.example.aryam.tripsplit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aryam.tripsplit.Child;
import com.example.aryam.tripsplit.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by aryam on 2/13/2018.
 */

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildHolder> {

    ArrayList<Child> childArrayList = new ArrayList<>();
    public ChildAdapter(ArrayList<Child> children){childArrayList = children;}


    @Override
    public ChildAdapter.ChildHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflateView = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row,parent,false);
        ChildHolder childHolder = new ChildHolder(inflateView);
        return childHolder;
    }

    @Override
    public void onBindViewHolder(ChildAdapter.ChildHolder holder, int position) {
        Child currentChild = childArrayList.get(position);
        holder.name.setText(currentChild.getUser().getDisplayName());
        holder.amount.setText(SplitLogic.getChild.toString());
    }

    @Override
    public int getItemCount() {
        return childArrayList.size();
    }
    public class ChildHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView amount;

        public ChildHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_view);
            amount = itemView.findViewById(R.id.amount_view);
        }
    }
}

