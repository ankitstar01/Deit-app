package com.example.admin.dietplan;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
     Button Lose,Plan,Tips,Burning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar);
        ActionBar actionBar =getSupportActionBar();
        Lose=(Button)findViewById(R.id.button2);
        Plan=(Button)findViewById(R.id.button3);
        Tips=(Button)findViewById(R.id.button4);
        Burning=(Button)findViewById(R.id.button6);
        Lose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i=new Intent(Welcome.this,LoseActivity.class);
              startActivity(i);
              finish();
            }
        });
        Plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent n=new Intent(Welcome.this,PlanActivity.class);
             startActivity(n);
             finish();
            }
        });
        Burning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent b=new Intent(Welcome.this,BurningActivity.class);
           startActivity(b);
           finish();
            }
        });
        Tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent l=new Intent(Welcome.this,TipsActivity.class);
           startActivity(l);
           finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Welcome.this, LoginActivity.class));
        finish();
    }
}
