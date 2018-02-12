package com.example.aryam.tripsplit;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aryam on 2/12/2018.
 */

public class SplitAdapter extends RecyclerView.Adapter<SplitAdapter.SplitHolder> {

    ArrayList<Split> splitArrayList = new ArrayList<>();
    public SplitAdapter(ArrayList<Split> splits){splitArrayList = splits;}


    @Override
    public SplitAdapter.SplitHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflateView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        SplitHolder splitHolder = new SplitHolder(inflateView);
        return splitHolder;
    }

    @Override
    public void onBindViewHolder(SplitAdapter.SplitHolder holder, int position) {
        Split currentSplit = splitArrayList.get(position);
        holder.name.setText(currentSplit.getUser().getDisplayName());
        holder.amount.setText(SplitLogic.getSplit.toString());
        Picasso.with(holder.avatar.getContext()).load(currentSplit.getUser().getPhotoUrl()).into(holder.avatar);
    }

    @Override
    public int getItemCount() {
        return splitArrayList.size();
    }
    public class SplitHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView amount;
        de.hdodenhof.circleimageview.CircleImageView avatar;


        public SplitHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_view);
            amount = itemView.findViewById(R.id.amount_view);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}
