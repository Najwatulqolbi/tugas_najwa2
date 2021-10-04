package com.example.tugas_najwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tugas_najwa.najwa1;
import com.example.tugas_najwa.najwa2;
import com.example.tugas_najwa.najwa3;
import com.example.tugas_najwa.najwa4;


public class MainActivity extends AppCompatActivity {

    ImageView ivpotato, ivpaprika, ivbayam, ivbrokoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivpotato = findViewById(R.id.iv_potato);
        ivpotato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, najwa1.class);
                startActivity(intent);
            }
        });

        ivpaprika = findViewById(R.id.iv_paprika);
        ivpaprika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, najwa2.class);
                startActivity(intent);
            }
        });

        ivbayam = findViewById(R.id.iv_bayam);
        ivbayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, najwa3.class);
                startActivity(intent);
            }
        });

        ivbrokoli = findViewById(R.id.iv_brokoli);
        ivbrokoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, najwa4.class);
                startActivity(intent);
            }
        });



    }
}