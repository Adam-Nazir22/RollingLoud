package com.example.rollingloud;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rollingloud.artists.PopBillieEilish;
import com.example.rollingloud.artists.PopChrisBrown;
import com.example.rollingloud.artists.PopDrake;
import com.example.rollingloud.artists.PopFuture;
import com.example.rollingloud.artists.PopKendrickLamar;
import com.example.rollingloud.artists.PopSZA;
import com.example.rollingloud.artists.PopTheWeeknd;
import com.example.rollingloud.artists.PopTravisScott;

public class Headliners extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headliners);

        Button chris_brown =  findViewById(R.id.chris_brown);
        chris_brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChrisBrown();
            }
        });

        Button the_weeknd = findViewById(R.id.the_weeknd);
        the_weeknd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheWeeknd();
            }
        });

        Button drake = findViewById(R.id.drake);
        drake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrake();
            }
        });

        Button kendrick_lamar = findViewById(R.id.kendrick_lamar);
        kendrick_lamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKendrickLamar();
            }
        });

        Button sza = findViewById(R.id.sza);
        sza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSZA();
            }
        });

        Button billie_eilish = findViewById(R.id.billie_eilish);
        billie_eilish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBillieEilish();
            }
        });

        Button future = findViewById(R.id.future);
        future.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFuture();
            }
        });

        Button travis_scott = findViewById(R.id.travis_scott);
        travis_scott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTravisScott();
            }
        });
    }

    public void openChrisBrown() {
        Intent intent = new Intent(this, PopChrisBrown.class);
        startActivity(intent);
    }
    public void openTheWeeknd() {
        Intent intent = new Intent(this, PopTheWeeknd.class);
        startActivity(intent);
    }
    public void openDrake() {
        Intent intent = new Intent(this, PopDrake.class);
        startActivity(intent);
    }
    public void openKendrickLamar() {
        Intent intent = new Intent(this, PopKendrickLamar.class);
        startActivity(intent);
    }
    public void openSZA() {
        Intent intent = new Intent(this, PopSZA.class);
        startActivity(intent);
    }
    public void openBillieEilish() {
        Intent intent = new Intent(this, PopBillieEilish.class);
        startActivity(intent);
    }
    public void openFuture() {
        Intent intent = new Intent(this, PopFuture.class);
        startActivity(intent);
    }
    public void openTravisScott() {
        Intent intent = new Intent(this, PopTravisScott.class);
        startActivity(intent);
    }
}