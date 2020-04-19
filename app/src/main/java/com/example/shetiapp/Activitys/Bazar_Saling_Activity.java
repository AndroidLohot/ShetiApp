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

        int position=bundle.getInt("position");



        FragmentTransaction ft=getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_bazar,fragmentChoice(position));
        ft.commit();
    }

    private Fragment fragmentChoice(int positionChoice) {

        if (positionChoice==1) {

            return new Kad_Dhany_Input();

        }
        else if (positionChoice==2) {

            return new Bhaji_Input();

        }

        return new Phale_Input();

    }
}














