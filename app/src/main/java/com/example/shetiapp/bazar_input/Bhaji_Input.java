package com.example.shetiapp.bazar_input;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shetiapp.R;

import java.util.ArrayList;

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
    private RadioButton rKg,rJodi;

    private Spinner spJatChoice;
    private ArrayAdapter adapter;
    private ArrayList arrayList;

    private void inView(View view) {

        edOwnerName=view.findViewById(R.id.ed_SelingOwnerName);
        edKG=view.findViewById(R.id.ed_SelingKG);
        edJodi=view.findViewById(R.id.ed_SelingJodi);
        edPrice=view.findViewById(R.id.ed_SelingPrices);


        cbGrupe=view.findViewById(R.id.cbSelingGroup);
        cbGaow=view.findViewById(R.id.cbSelingGaow);
        cbAll=view.findViewById(R.id.cbSelingAll);
        rgProductWeight=view.findViewById(R.id.rgProductWeight);
        tvSetPrices=view.findViewById(R.id.tvSelingShowSetPrices);
        imBtnIP=view.findViewById(R.id.imageBtnSelingProduct);
        btnSeling=view.findViewById(R.id.btn_Seling);
        spJatChoice=view.findViewById(R.id.sp_SelingProductJat);
        rKg=view.findViewById(R.id.rKg);
        rJodi=view.findViewById(R.id.rJodi);


        edKG.setVisibility(View.INVISIBLE);
        edJodi.setVisibility(View.INVISIBLE);


        arrayList=new ArrayList();

        arrayList.add("Jat 1");
        arrayList.add("Jat 2");
        arrayList.add("Jat 3");

        adapter=new ArrayAdapter(view.getContext(), android.R.layout.simple_list_item_1,arrayList);
        spJatChoice.setAdapter(adapter);
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
        final View view= inflater.inflate(R.layout.fragment_bhaji__input, container, false);

        inView(view);

        cbGaow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {

                    Toast.makeText(view.getContext(), "Kg", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(view.getContext(), "Jodi", Toast.LENGTH_LONG).show();

                }
            }
        });











        return view;
    }

}
