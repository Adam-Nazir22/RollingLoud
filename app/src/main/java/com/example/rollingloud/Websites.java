package com.example.rollingloud;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("Registered")
public class Websites extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);

    }
    public void youtubeButton (View view) {
        Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCxrr-B7ydfDYr4sqsxNg5WA"));
        startActivity(youtubeIntent);
    }
    public void logoButton (View view) {
        Intent logoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rollingloud.com"));
        startActivity(logoIntent);
    }
    public void instagramButton (View view) {
        Intent instagramIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rollingloud/?hl=en"));
        startActivity(instagramIntent);
    }
}
