package com.example.shetiapp.bazar_Output;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shetiapp.Adqpter.MyAdapter;
import com.example.shetiapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bazar_Show_List extends Fragment {

    private int positionKBP,prodect;

    private ArrayList<String> arrayList;
    private RecyclerView rvShowList;
    private RecyclerView.LayoutManager layoutManager;
    private MyAdapter myAdapter;


    public Bazar_Show_List(int positionKBP, int prodect) {

        this.positionKBP=positionKBP;
        this.prodect=prodect;
    }

    public Bazar_Show_List() {
        // Required empty public constructor
    }

    private void inView(View view) {

        rvShowList=view.findViewById(R.id.rv_Baying_Main_List);
        rvShowList.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        rvShowList.setLayoutManager(layoutManager);
        arrayList=new ArrayList<>();
        myAdapter=new MyAdapter(prodect,arrayList,getContext());
        rvShowList.setAdapter(myAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_bazar__show__list, container, false);


        inView(view);

        arrayList.add("Vikas");
        arrayList.add("Dhanesh");
        arrayList.add("Yogesh");





        myAdapter=new MyAdapter(prodect,arrayList,getContext());
        rvShowList.setAdapter(myAdapter);


        return view;
    }

}
