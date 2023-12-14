package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        if (intent != null) {
            int fragmentId = intent.getIntExtra("fragmentId", 0);

            if (fragmentId != 0) {
                changeFragment(fragmentId);
            }
        }

    }

    public void changeFragment(int id) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Intent intent=getIntent();


        if (id==(R.id.pannerImage)){
            ft.replace(R.id.RecipeContainer,new Panner());
            ft.commit();
        }
        else if (id==(R.id.naanimage)) {
            ft.replace(R.id.RecipeContainer, new naan());
            ft.commit();
        }
        else if (id==(R.id.halwaimage)) {
            ft.replace(R.id.RecipeContainer, new halwa());
            ft.commit();
        }
        else if (id==(R.id.tikkaimage)) {
            ft.replace(R.id.RecipeContainer, new tikka());
            ft.commit();
        }
        else if (id==(R.id.kulchaimage)) {
            ft.replace(R.id.RecipeContainer, new kulcha());
            ft.commit();
        }
        else if (id==(R.id.gulaabimage)) {
            ft.replace(R.id.RecipeContainer,new jammun());
            ft.commit();
        }

    }
}

