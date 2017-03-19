package com.example.lenovo.clientapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 17-03-2017.
 */

public class User_viewdetails_adapter extends RecyclerView.Adapter<User_viewdetails_adapter.MyViewHolder> {


    private Context mContext;
    private List<User_details_info> infoList;


    public User_viewdetails_adapter(Context mContext , List<User_details_info> list)
    {
        this.mContext = mContext;
        this.infoList = list;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView username,emailid,mobileno,emergncyno,text;

        public MyViewHolder(View itemView) {
            super(itemView);
            username = (TextView)itemView.findViewById(R.id.username);
            mobileno = (TextView)itemView.findViewById(R.id.mob_num);
            emailid = (TextView)itemView.findViewById(R.id.email);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_user_details, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final User_details_info details = infoList.get(position);
        holder.username.setText(details.getUsername());
        holder.mobileno.setText(details.getMobileno());
        holder.emailid.setText(details.getEmailid());

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

}
