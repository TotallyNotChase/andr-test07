package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView t = findViewById(R.id.show_text);

        Intent inputIntent = getIntent();
        if (inputIntent != null) {
            String city = inputIntent.getStringExtra("city");
            t.setText(city);
        }

        Button b = findViewById(R.id.back_button);
        b.setOnClickListener(v -> {
            Intent intent = new Intent(ShowActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
