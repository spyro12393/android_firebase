package com.example.jasonjr.appwatch0530;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /*
    public void signup(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        // intent.putExtra("BMI_EXTRA", bmi);
        startActivity(intent);
    }
    */

    public void register(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
