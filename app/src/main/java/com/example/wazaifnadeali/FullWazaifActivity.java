package com.example.wazaifnadeali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.model.content.ShapeTrimPath;

public class FullWazaifActivity extends AppCompatActivity {
    TextView WazaifTitle, WazaifDetails, WazaifTriqa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_wazaif);
     WazaifTitle = findViewById(R.id.IDWazaifTitle);
     WazaifDetails = findViewById(R.id.IDwazaifDetails);
     WazaifTriqa = findViewById(R.id.IDwazaifTriqa);
        Intent intent = getIntent();
        String titleValue = intent.getStringExtra("wazaifTitle").toString();
        String DetailsValue = intent.getStringExtra("wazaifDetails").toString();
        String TriqaValue = intent.getStringExtra("wazaifTriqa").toString();
       getSupportActionBar().setTitle(titleValue);
        WazaifTitle.setText(titleValue);
        WazaifDetails.setText(DetailsValue);
        WazaifTriqa.setText(TriqaValue);


    }
}