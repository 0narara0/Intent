package com.example.chomy.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExplicitActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit3);
        Button button = findViewById(R.id.buttonListView);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
