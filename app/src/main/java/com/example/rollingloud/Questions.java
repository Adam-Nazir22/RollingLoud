package com.example.rollingloud;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Questions extends AppCompatActivity {

    private Button send;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        final String userInput = getString(R.string.input_hint);

        input = (EditText) findViewById(R.id.input);

        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(input.getText().toString())) {
                    Toast.makeText(Questions.this, "Please Input Before Sending", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Questions.this, "Thank you for your support :)", Toast.LENGTH_SHORT).show();
                    input.getText().clear();
                }
            }
        });
    }

}
