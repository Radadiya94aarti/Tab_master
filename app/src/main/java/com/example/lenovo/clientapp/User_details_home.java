package com.example.lenovo.clientapp;


import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.lenovo.clientapp.R.attr.layoutManager;


public class User_details_home extends Fragment {


    List<User_details_info> info = new ArrayList<>();
    RecyclerView recyclerView;
    User_viewdetails_adapter adapter;
    int numbers_post = 0;


    public User_details_home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_user_details, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.user_details);
        recyclerView.setHasFixedSize(true);
        adapter = new User_viewdetails_adapter(getActivity(),info);
        adapter.notifyDataSetChanged();
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return view;


    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
}
