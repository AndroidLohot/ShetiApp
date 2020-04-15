package com.example.shetiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.shetiapp.fragmentContainer.Aandaj;
import com.example.shetiapp.fragmentContainer.Bazar;
import com.example.shetiapp.fragmentContainer.Home;
import com.example.shetiapp.fragmentContainer.Par;
import com.example.shetiapp.fragmentContainer.SevaDeneGhene;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    private BottomNavigationView bottomNV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNV=(BottomNavigationView)findViewById(R.id.bottomNBar);

        bottomNV.setOnNavigationItemSelectedListener(this);

        fragmentLoad(new Home());

    }

    private boolean fragmentLoad(Fragment fragment){

        if (fragment!=null)
        {


            FragmentTransaction ft=getSupportFragmentManager().
                    beginTransaction().
                    replace(R.id.mainFragment,fragment);
            ft.commit();

            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment=null;

        switch (item.getItemId())
        {
            case R.id.bniHome:
                fragment=new Home();
                break;
            case R.id.bniBazr:
                fragment=new Bazar();
                break;
            case R.id.binAndaj:
                fragment=new Aandaj();
                break;
            case R.id.bniSevaDeneGhene:
                fragment=new SevaDeneGhene();
                break;
            case R.id.bniPar:
                fragment=new Par();
                break;
        }

        return fragmentLoad(fragment);
    }
}
