package com.example.shetiapp.bazar_Output;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shetiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kad_Dhany_Output extends Fragment {

    private int positionKBP;
    private int prodect;

    public Kad_Dhany_Output(int positionKBP, int prodect) {
        this.positionKBP = positionKBP;
        this.prodect = prodect;
    }

    public Kad_Dhany_Output(int contentLayoutId, int positionKBP, int prodect) {
        super(contentLayoutId);
        this.positionKBP = positionKBP;
        this.prodect = prodect;
    }

    public Kad_Dhany_Output() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kad__dhany__output, container, false);
    }

}
