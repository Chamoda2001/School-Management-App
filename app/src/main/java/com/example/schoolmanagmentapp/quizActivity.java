package com.example.schoolmanagmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class quizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

            Button btnback = findViewById(R.id.btnback);
            btnback.setOnClickListener(v -> {
                Intent intent = new Intent(quizActivity.this, Dashboard.class);
                startActivity(intent);
                finish();
            });
    }
}