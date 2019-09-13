package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView txtResultEmail, txtResultPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtResultEmail	=	(TextView)findViewById(R.id.txtResultEmail);
        txtResultPass = (TextView)findViewById(R.id.txtResultPass);
        Intent myIntent = getIntent();
        Bundle	myBunble=	myIntent.getBundleExtra("result");
        String text_email	=	myBunble.getString("text_email");
        String text_pass 	=	myBunble.getString("text_pass");
        txtResultEmail.setText("Email: "+text_email);
        txtResultPass.setText("Pass: "+text_pass);
    }
}
