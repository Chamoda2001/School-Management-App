package com.example.schoolmanagmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Back to LoginActivity
        Button btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, loginActivity.class);
            startActivity(intent);
            finish();
        });

        // Navigate to SubjectActivity
        Button btnsubject = findViewById(R.id.btnsubject);
        btnsubject.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, SubjectActivity.class);
            startActivity(intent);
            finish();
        });

        // Navigate to quizActivity
        Button btnquiz = findViewById(R.id.btnquiz);
        btnquiz.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, quizActivity.class);
            startActivity(intent);
            finish();
        });

        // Navigate to tipActivity
        Button btnstudytip = findViewById(R.id.btnstudytip);
        btnstudytip.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, tipActivity.class);
            startActivity(intent);
            finish();
        });

        // Navigate to teacherActivity
        Button btnteacher = findViewById(R.id.btnteacher);
        btnteacher.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, teacherActivity.class);
            startActivity(intent);
            finish();
        });

        Button btnuser = findViewById(R.id.btnuser);
        btnuser.setOnClickListener(v -> {
            Intent intent = new Intent(Dashboard.this, profileActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
