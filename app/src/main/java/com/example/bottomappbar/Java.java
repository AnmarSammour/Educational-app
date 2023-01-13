package com.example.bottomappbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;

public class Java extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;

    LinearLayout hiddeView1,hiddeView2,hiddeView3,hiddeView4;

    CardView cardView1,cardView2,cardView3,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Java");

        setSupportActionBar(toolbar);

        answer1 = (Button) findViewById(R.id.answer1);
        hiddeView1 =(LinearLayout) findViewById(R.id.hiddeView1);
        cardView1 = (CardView) findViewById(R.id.CardView1);

        answer2 = (Button) findViewById(R.id.answer2);
        hiddeView2 =(LinearLayout) findViewById(R.id.hiddeView2);
        cardView2 = (CardView) findViewById(R.id.CardView2);

        answer3 = (Button) findViewById(R.id.answer3);
        hiddeView3 =(LinearLayout) findViewById(R.id.hiddeView3);
        cardView3 = (CardView) findViewById(R.id.CardView3);

        answer4 = (Button) findViewById(R.id.answer4);
        hiddeView4 =(LinearLayout) findViewById(R.id.hiddeView4);
        cardView4 = (CardView) findViewById(R.id.CardView4);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView1.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    hiddeView1.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    hiddeView1.setVisibility(v.VISIBLE);
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView2.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    hiddeView2.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    hiddeView2.setVisibility(v.VISIBLE);
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView3.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    hiddeView3.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    hiddeView3.setVisibility(v.VISIBLE);
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView4.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    hiddeView4.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    hiddeView4.setVisibility(v.VISIBLE);
                }

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
                Intent i = new Intent(Java.this,JavaT.class);
                startActivity(i);
        }
        return true;
    }
}