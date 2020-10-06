package com.example.basicclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soldier rambo = new Soldier();

        rambo.health = 150;
        rambo.soldierType = "Infantory";

        Soldier terminator = new Soldier();

        terminator.health = 140;
        terminator.soldierType = "Baltalion";

        Log.i("Rambo's health" , "" + rambo.health);
        Log.i("Terminator's health", "" + terminator.health);

        rambo.shootEnemey();
        terminator.shootEnemey();
    }

}