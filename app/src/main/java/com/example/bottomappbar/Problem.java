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

public class Problem extends AppCompatActivity {
    BottomAppBar bottomAppBar;
    Toolbar toolbar;

    Button answer,answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9;

    LinearLayout hiddeView,hiddeView1,hiddeView2,hiddeView3,hiddeView4,
            hiddeView5,hiddeView6,hiddeView7,hiddeView8,hiddeView9;

    CardView cardView,cardView1,cardView2,cardView3,cardView4,cardView5,
            cardView6,cardView7,cardView8,cardView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problem);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Problem Solving");

        setSupportActionBar(toolbar);

        answer = (Button) findViewById(R.id.answer);
        hiddeView =(LinearLayout) findViewById(R.id.hiddeView);
        cardView = (CardView) findViewById(R.id.CardView);

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

        answer5 = (Button) findViewById(R.id.answer5);
        hiddeView5 =(LinearLayout) findViewById(R.id.hiddeView5);
        cardView5 = (CardView) findViewById(R.id.CardView5);

        answer6 = (Button) findViewById(R.id.answer6);
        hiddeView6 =(LinearLayout) findViewById(R.id.hiddeView6);
        cardView6 = (CardView) findViewById(R.id.CardView6);

        answer7 = (Button) findViewById(R.id.answer7);
        hiddeView7 =(LinearLayout) findViewById(R.id.hiddeView7);
        cardView7 = (CardView) findViewById(R.id.CardView7);

        answer8 = (Button) findViewById(R.id.answer8);
        hiddeView8 =(LinearLayout) findViewById(R.id.hiddeView8);
        cardView8 = (CardView) findViewById(R.id.CardView8);

        answer9 = (Button) findViewById(R.id.answer9);
        hiddeView9 =(LinearLayout) findViewById(R.id.hiddeView9);
        cardView9 = (CardView) findViewById(R.id.CardView9);

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddeView.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    hiddeView.setVisibility(v.VISIBLE);
                }

            }
        });

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

        answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView5.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    hiddeView5.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView5, new AutoTransition());
                    hiddeView5.setVisibility(v.VISIBLE);
                }

            }
        });

        answer6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView6.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    hiddeView6.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView6, new AutoTransition());
                    hiddeView6.setVisibility(v.VISIBLE);
                }

            }
        });

        answer7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView7.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    hiddeView7.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView7, new AutoTransition());
                    hiddeView7.setVisibility(v.VISIBLE);
                }

            }
        });

        answer8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView8.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    hiddeView8.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView8, new AutoTransition());
                    hiddeView8.setVisibility(v.VISIBLE);
                }

            }
        });

        answer9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(hiddeView9.getVisibility() == v.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    hiddeView9.setVisibility(v.GONE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView9, new AutoTransition());
                    hiddeView9.setVisibility(v.VISIBLE);
                }

            }
        });



        bottomAppBar =(BottomAppBar) findViewById(R.id.bottomappbar);
        setSupportActionBar(bottomAppBar);

        bottomAppBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
            }
        });
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
            case R.id.search:
                bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
            case R.id.homee:
                Intent i = new Intent(Problem.this,JavaT.class);
                startActivity(i);

        }
        return true;
    }



}