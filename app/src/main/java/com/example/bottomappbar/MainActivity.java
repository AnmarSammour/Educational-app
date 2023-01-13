package com.example.bottomappbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    CardView java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Learn programming languages");

        setSupportActionBar(toolbar);

        java = (CardView) findViewById(R.id.CardViewjava);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,JavaT.class);
                startActivity(i);
            }
        });

        BottomAppBar bottomAppBar =(BottomAppBar) findViewById(R.id.bottomappbar);
        setSupportActionBar(bottomAppBar);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_app_bar_menu,menu);
        return true;
    }
}