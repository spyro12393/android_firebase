package com.example.jasonjr.appwatch0530;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        mText = findViewById(R.id.txtAccount);
        mText.setText(email);

    }

    public void clickSubmit(View view) {


        findViewById(R.id.txtAccount);

    }
}
