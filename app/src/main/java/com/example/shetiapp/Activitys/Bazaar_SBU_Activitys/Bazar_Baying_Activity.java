package com.example.shetiapp.Activitys.Bazaar_SBU_Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.shetiapp.R;
import com.example.shetiapp.bazar_Output.Bazar_Show_List;

public class Bazar_Baying_Activity extends AppCompatActivity {

    private int positionKBP,positionProdect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazar__baying_);

        Bundle bundle=getIntent().getExtras();

        // this getting value of bazaar fragment
        // the positionKBP contan index of category in product
        // the product contan product index
        int positionKBP=bundle.getInt("positionKBP");
        int prodect=bundle.getInt("product");

        FragmentTransaction ft=getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_Baying_Frame,new Bazar_Show_List(positionKBP,positionProdect));
        ft.commit();





    }
}
