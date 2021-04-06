package com.example.rollingloud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homescreen extends AppCompatActivity  {
    private Button description;
    private Button location;
    private Button headliners;
    private Button websites;
    private Button questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        description = (Button) findViewById(R.id.description);
        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDescription();
            }
        });

        location = (Button) findViewById(R.id.location);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();
            }
        });

        websites = (Button) findViewById(R.id.websites);
        websites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsites();
            }
        });

        headliners = (Button) findViewById(R.id.headliners);
        headliners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHeadliners();
            }
        });

        questions = (Button) findViewById(R.id.questions);
        questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestions();
            }
        });


    }

    public void openDescription() {
        Intent intent = new Intent(this, Description.class);
        startActivity(intent);
    }

    public void openLocation() {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }
    public void openHeadliners() {
        Intent intent = new Intent(this, Headliners.class);
        startActivity(intent);
    }
    public void openWebsites() {
        Intent intent = new Intent(this, Websites.class);
        startActivity(intent);
    }
    public void  openQuestions() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

}

