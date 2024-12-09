package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        ConstraintLayout layout = findViewById(R.id.main);
        Random rnd = new Random();


        button.setOnClickListener(v -> {
            int color = Color.argb(150, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            layout.setBackgroundColor(color);
        });
    }
}