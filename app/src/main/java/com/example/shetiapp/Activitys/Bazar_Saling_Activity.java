package com.example.shetiapp.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.shetiapp.R;
import com.example.shetiapp.bazar_input.Bhaji_Input;
import com.example.shetiapp.bazar_input.Kad_Dhany_Input;
import com.example.shetiapp.bazar_input.Phale_Input;

public class Bazar_Saling_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bazar_saling_activity);

        Bundle bundle=getIntent().getExtras();

        int positionKBP=bundle.getInt("positionKBP");
        int prodect=bundle.getInt("prodect");



        FragmentTransaction ft=getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_bazar,fragmentChoice(positionKBP,prodect));
        ft.commit();
    }

    private Fragment fragmentChoice(int positionKBP,int Prodect) {

        if (positionKBP==1) {

            return new Kad_Dhany_Input(Prodect);

        }
        else if (positionKBP==2) {

            return new Bhaji_Input(Prodect);

        }

        return new Phale_Input(Prodect);

    }
}














