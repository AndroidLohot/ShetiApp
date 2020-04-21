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

    private Spinner spChoiceKDB,spChoiceProdect;
    private Button btn_Bazar_Sale,btn_Bazar_Bay;

    // this ArrayList and ArrayAddapter containing KD B P
    private ArrayList<String> arrayList_KBP;
    private ArrayAdapter<String> adapter_KBP;

    // this ArrayList and ArrayAddapter containing prodect
    private ArrayList<String> list_prodect_kd;
    private ArrayList<String> list_prodect_p;
    private ArrayList<String> list_prodect_b;
    private ArrayAdapter<String> adapter_prodect;

    // this variable containing the spinner position
    private int positionKBP;
    private int prodect;


    public Bazar() {
        // Required empty public constructor
    }

    private void inView(View view) {

        spChoiceKDB=view.findViewById(R.id.spChoiceKDB);
        spChoiceProdect=view.findViewById(R.id.spChoiceProdect);
        btn_Bazar_Sale=view.findViewById(R.id.btn_Bazar_Sale);
        btn_Bazar_Bay=view.findViewById(R.id.btn_Bazar_Bay);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_bnb_bazar, container, false);

        inView(view);



        // this code chose prodect category
        arrayList_KBP=new ArrayList<>();

        arrayList_KBP.add("Chose your prodect");

        arrayList_KBP.add("Kad Dhanay");
        arrayList_KBP.add("Bhaji");
        arrayList_KBP.add("Phale");

        adapter_KBP=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList_KBP);
        spChoiceKDB.setAdapter(adapter_KBP);

        // this code desplay the prodect
        list_prodect_kd=new ArrayList<>();
        list_prodect_b=new ArrayList<>();
        list_prodect_p=new ArrayList<>();

        spChoiceKDB.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                positionKBP=position;

                if (position==1) {

                    list_prodect_kd.add("Bajery");
                    list_prodect_kd.add("Gehu");
                    list_prodect_kd.add("Jwary");

                    adapter_prodect=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,list_prodect_kd);
                    spChoiceProdect.setAdapter(adapter_prodect);

                }
                if (position==2) {

                    list_prodect_b.add("Mathi");
                    list_prodect_b.add("Dhana");
                    list_prodect_b.add("Kakedi");

                    adapter_prodect=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,list_prodect_b);
                    spChoiceProdect.setAdapter(adapter_prodect);


                }
                if (position==3) {

                    list_prodect_p.add("Keli");
                    list_prodect_p.add("Chiku");
                    list_prodect_p.add("Paru");

                    adapter_prodect=new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,list_prodect_p);
                    spChoiceProdect.setAdapter(adapter_prodect);


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spChoiceProdect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                prodect=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btn_Bazar_Sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (positionKBP==0) {

                    Toast.makeText(getContext(),"PLZ Select ani opetion",Toast.LENGTH_LONG).show();

                }
                else {

                    Bundle bundle=new Bundle();

                    bundle.putInt("positionKBP",positionKBP);
                    bundle.putInt("prodect",prodect);

                    Intent intent=new Intent(getContext(),Bazar_Saling_Activity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }


            }
        });


        btn_Bazar_Bay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (positionKBP==0) {

                    Toast.makeText(getContext(),"PLZ Select ani opetion",Toast.LENGTH_LONG).show();

                }
                else {

                    Bundle bundle=new Bundle();

                    bundle.putInt("positionKBP",positionKBP);
                    bundle.putInt("positionProdect",prodect);

                    Intent intent=new Intent(getContext(),Bazar_Baying_Activity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }

            }
        });










        return view;
    }

}
