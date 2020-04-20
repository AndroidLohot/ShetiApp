package com.example.shetiapp.bazar_Output;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shetiapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bazar_Show_List extends Fragment {

    private int positionKBP,positionJat;

    private ArrayList<String> arrayList;



    public Bazar_Show_List() {
        // Required empty public constructor
    }

    public Bazar_Show_List(int positionKBP, int positionJat) {

        this.positionKBP=positionKBP;
        this.positionJat=positionJat;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bazar__show__list, container, false);
    }

}
