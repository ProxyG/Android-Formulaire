package com.example.formulaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        txt = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        Etudiant e = (Etudiant) i.getSerializableExtra("et");

        txt.setText("Bonjour " +e.getGenre() + " " + e.getNom() + " " + e.getPrenom() + " vous avez choisi: " + e.getChoix() );
    }
}