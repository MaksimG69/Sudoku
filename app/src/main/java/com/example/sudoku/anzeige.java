package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class anzeige extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anzeige);
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.tabelle_schwarz_weiss);

    }
}
