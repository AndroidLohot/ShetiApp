package com.example.shetiapp.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.shetiapp.R;
import com.example.shetiapp.bazar_Output.Bazar_Show_List;

public class Bazar_Baying_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bazar__baying_);

        FragmentTransaction ft=getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_Baying_Frame,new Bazar_Show_List());
        ft.commit();

















    }
}
