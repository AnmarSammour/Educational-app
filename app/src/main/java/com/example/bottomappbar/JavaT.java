package com.example.bottomappbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomappbar.BottomAppBar;

public class JavaT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_t);


        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Java Tutorial");

        setSupportActionBar(toolbar);

        CardView java1,meth,cla,ps;
        java1 = (CardView) findViewById(R.id.CardViewjava1);
        meth = (CardView) findViewById(R.id.CardViewMethods);
        cla = (CardView) findViewById(R.id.CardViewClass);
        ps = (CardView) findViewById(R.id.CardViewproblem);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(JavaT.this,Problem.class);
                startActivity(i);
            }
        });
        java1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(JavaT.this,Java.class);
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.homee:
                Intent i = new Intent(JavaT.this,MainActivity.class);
                startActivity(i);
        }
        return true;
    }

}