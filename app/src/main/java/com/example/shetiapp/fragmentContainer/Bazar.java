package com.example.shetiapp.fragmentContainer;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.shetiapp.Activitys.Bazar_Baying_Activity;
import com.example.shetiapp.Activitys.Bazar_Saling_Activity;
import com.example.shetiapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Bazar extends Fragment {

    private Spinner sp_Select_Bazar_Option,sp_Select_Bazar_Option_2;
    private Button btn_Bazar_Sale,btn_Bazar_Bay;
    private ArrayList<String> arrayList_KBP;
    private ArrayAdapter<String> adapter_KBP;

    private ArrayList<String> arrayList_Jat_K;
    private ArrayList<String> arrayList1_Jat_B;
    private ArrayList<String> arrayList1_Jat_P;
    private ArrayAdapter<String> adapter_Jat;

    private int positionKBP,positionJat;

    public Bazar() {
        // Required empty public constructor
    }

    private void inView(View view) {

        sp_Select_Bazar_Option=view.findViewById(R.id.sp_Select_Bazar_Option);
        sp_Select_Bazar_Option_2=view.findViewById(R.id.sp_Select_Bazar_Option_2);
        btn_Bazar_Sale=view.findViewById(R.id.btn_Bazar_Sale);
        btn_Bazar_Bay=view.findViewById(R.id.btn_Bazar_Bay);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_bnb_bazar, container, false);

        inView(view);

        arrayList_KBP =new ArrayList<>();

        arrayList_KBP.add("Choice select");
        arrayList_KBP.add("Kad Dhany");
        arrayList_KBP.add("Bhajay");
        arrayList_KBP.add("Phale");

        adapter_KBP=new ArrayAdapter<>(view.getContext(),android.R.layout.simple_list_item_1, arrayList_KBP);
        sp_Select_Bazar_Option.setAdapter(adapter_KBP);


        arrayList_Jat_K=new ArrayList<>();
        arrayList1_Jat_B=new ArrayList<>();
        arrayList1_Jat_P=new ArrayList<>();

        // this code select kad dhanay bhaji phale position
        sp_Select_Bazar_Option.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                positionKBP=position;

                if (position==1)
                {
                    // choice of Kad Dhanay Jat
                    arrayList_Jat_K.add("Kad Dhanay Jat 1");
                    arrayList_Jat_K.add("Kad Dhanay Jat 2");
                    arrayList_Jat_K.add("Kad Dhanay Jat 3");

                    adapter_Jat=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList_Jat_K);
                    sp_Select_Bazar_Option_2.setAdapter(adapter_Jat);
                }
                if (position==2)
                {

                    // choice of Bhaji Jat
                    arrayList1_Jat_B.add("Bhaji Jat 1");
                    arrayList1_Jat_B.add("Bhaji Jat 2");
                    arrayList1_Jat_B.add("Bhaji Jat 3");

                    adapter_Jat=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList1_Jat_B);
                    sp_Select_Bazar_Option_2.setAdapter(adapter_Jat);
                }
                if (position==3)
                {
                    // choice of Phale Jat
                    arrayList1_Jat_P.add("Phale Jat 1");
                    arrayList1_Jat_P.add("Phale Jat 2");
                    arrayList1_Jat_P.add("Phale Jat 3");

                    adapter_Jat=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList1_Jat_P);
                    sp_Select_Bazar_Option_2.setAdapter(adapter_Jat);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp_Select_Bazar_Option_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                positionJat=position;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // this is code going sale opetion
        btn_Bazar_Sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (positionKBP==0)
                {
                    Toast.makeText(getContext(),"Plz select ani option",Toast.LENGTH_LONG).show();
                } else
                    {

                    Bundle bundle=new Bundle();
                    bundle.putInt("position",positionKBP);

                    Intent intent=new Intent(view.getContext(),Bazar_Saling_Activity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);

                }
            }
        });


        // this code going bay opetion
        btn_Bazar_Bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (positionKBP==0)
                {
                    Toast.makeText(getContext(),"Plz select ani option",Toast.LENGTH_LONG).show();
                } else
                {

                    Bundle bundle=new Bundle();
                    bundle.putInt("position",positionKBP);

                    Intent intent=new Intent(view.getContext(), Bazar_Baying_Activity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);

                }

            }
        });


        return view;
    }

}
