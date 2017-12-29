package com.example.hiro.myomikujiapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void getOmikuji(View view) {
        TextView tv = (TextView) findViewById(R.id.myTextView);

        TextView debugArea = (TextView) findViewById(R.id.myDebug);

        OmikujiFactory omikujiFactory = new OmikujiFactory();
        Omikuji omikuji = omikujiFactory.create((String) view.getTag());
        debugArea.setText(omikuji.toString());

        tv.setText(omikuji.getFortune());
    }
}
