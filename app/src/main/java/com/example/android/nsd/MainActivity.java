package com.example.android.nsd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.awt.font.NumericShaper;

public class MainActivity extends AppCompatActivity {

    public TextView top;

    public TextView natnl;

    public  TextView state;

    public TextView international;

    public TextView business;

    public  TextView sports;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = findViewById(R.id.top_stories);
        natnl = findViewById(R.id.national_stories);
        state = findViewById(R.id.state_stories);
        international = findViewById(R.id.international_stories);
        business = findViewById(R.id.business_stories);
        sports = findViewById(R.id.sports_stories);

        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topIntent = new Intent(MainActivity.this,TopStories.class);
                startActivity(topIntent);

            }
        });
       natnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent natnlIntent = new Intent(MainActivity.this,NationalStories.class);
                startActivity(new Intent(MainActivity.this,NationalStories.class));
            }
        });
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stateIntent = new Intent(MainActivity.this,StateStories.class);
                startActivity(stateIntent);
            }
        });
        international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent internationalIntent = new Intent(MainActivity.this,InternationalStories.class);
                startActivity(internationalIntent);
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent businessIntent = new Intent(MainActivity.this,BusinessStories.class);
                startActivity(businessIntent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sportsIntent = new Intent(MainActivity.this,SportsStories.class);
                startActivity(sportsIntent);
            }
        });



    }
}
