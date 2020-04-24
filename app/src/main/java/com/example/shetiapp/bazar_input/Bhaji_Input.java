package com.example.shetiapp.bazar_input;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.shetiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bhaji_Input extends Fragment {

    private int product;

    // creating verifiables
    private EditText edOwnerName,edKG,edJodi, edPrice;
    private CheckBox cbGrupe,cbGaow,cbAll;
    private RadioGroup  rgProductWeight;
    private TextView tvSetPrices;
    private ImageButton imBtnIP;
    private Button btnSeling;

    private void inView(View view) {

        tvSetPrices=view.findViewById(R.id.tvSelingShowSetPrices);

        edOwnerName=view.findViewById(R.id.ed_SelingOwnerName);
        edKG=view.findViewById(R.id.ed_SelingKG);
        edJodi=view.findViewById(R.id.ed_SelingJodi);
        edPrice=view.findViewById(R.id.ed_SelingPrices);


        cbGrupe=view.findViewById(R.id.cbSelingGroup);
        cbGaow=view.findViewById(R.id.cbSelingGaow);
        cbAll=view.findViewById(R.id.cbSelingAll);

        rgProductWeight=view.findViewById(R.id.rgProductWeight);
    }


    public Bhaji_Input() {
        // Required empty public constructor
    }

    public Bhaji_Input(int prodect) {

        this.product=prodect;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_bhaji__input, container, false);

        return view;
    }

}
