package com.example.shetiapp.bazar_input;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shetiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Phale_Input extends Fragment {

    private int product ;


    public Phale_Input() {
        // Required empty public constructor
    }

    public Phale_Input(int product) {

        this.product =product;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_phale__input, container, false);

        return view;
    }

}
