package com.example.wazaifnadeali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button WazaifList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
//      MainActivity to WazaifListActivity using Online Read Button
         WazaifList = findViewById(R.id.readWazaifList);
         WazaifList.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, WazaifListActivity.class );
                 startActivity(intent);
             }
         });
    }
}