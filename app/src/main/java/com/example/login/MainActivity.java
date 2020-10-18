package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button bt;
    private TextView textview_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.btn_login);
        bt.setOnClickListener(this);

        textview_signup=findViewById(R.id.textview_signup);
        textview_signup.setOnClickListener(this);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.list:
                        startActivity(new Intent(getApplicationContext(), list.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return true;
            }
        });

    }

    @Override
    public void onClick(View view) {
        if (view==bt){
            startActivity(new Intent(MainActivity.this, list.class));
        }
        if (view==textview_signup){
            startActivity(new Intent(MainActivity.this, dangky.class));
        }
    }
}