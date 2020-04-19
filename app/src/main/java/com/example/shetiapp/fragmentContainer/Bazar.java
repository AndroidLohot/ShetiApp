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

    private Spinner sp_Select_Bazar_Option;
    private Button btn_Bazar_Sale,btn_Bazar_Bay;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    private int p;

    public Bazar() {
        // Required empty public constructor
    }

    private void inView(View view) {

        sp_Select_Bazar_Option=view.findViewById(R.id.sp_Select_Bazar_Option);
        btn_Bazar_Sale=view.findViewById(R.id.btn_Bazar_Sale);
        btn_Bazar_Bay=view.findViewById(R.id.btn_Bazar_Bay);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_bazar, container, false);

        inView(view);

        arrayList=new ArrayList<>();

        arrayList.add("Choice select");
        arrayList.add("Kad Dhany");
        arrayList.add("Bhajay");
        arrayList.add("Phale");

        adapter=new ArrayAdapter<>(view.getContext(),android.R.layout.simple_list_item_1,arrayList);
        sp_Select_Bazar_Option.setAdapter(adapter);


        sp_Select_Bazar_Option.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                p=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btn_Bazar_Sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (p==0)
                {
                    Toast.makeText(getContext(),"Plz select ani option",Toast.LENGTH_LONG).show();
                } else
                    {

                    Bundle bundle=new Bundle();
                    bundle.putInt("position",p);

                    Intent intent=new Intent(view.getContext(),Bazar_Saling_Activity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);

                }
            }
        });

        btn_Bazar_Bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (p==0)
                {
                    Toast.makeText(getContext(),"Plz select ani option",Toast.LENGTH_LONG).show();
                } else
                {

                    Bundle bundle=new Bundle();
                    bundle.putInt("position",p);

                    Intent intent=new Intent(view.getContext(), Bazar_Baying_Activity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);

                }

            }
        });


        return view;
    }

}
