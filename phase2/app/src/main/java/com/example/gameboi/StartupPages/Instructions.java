package com.example.gameboi.StartupPages;

import com.example.gameboi.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setMovementMethod(new ScrollingMovementMethod());

        TextView textView40 = findViewById(R.id.textView40);
        textView40.setMovementMethod(new ScrollingMovementMethod());

        TextView textView42 = findViewById(R.id.textView42);
        textView42.setMovementMethod(new ScrollingMovementMethod());

        TextView textView29 = findViewById(R.id.textView29);
        textView29.setMovementMethod(new ScrollingMovementMethod());
    }

    public void backButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
