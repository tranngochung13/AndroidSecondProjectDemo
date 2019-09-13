package com.example.androidsecondprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText edt_email = findViewById(R.id.edit_text_email);
        final EditText edt_pass	=	findViewById(R.id.edit_text_password);
        Button button_login	=	findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try{
                    Intent myIntent	=	new Intent(getApplication(),HomeActivity.class);
                    String text_email	=	edt_email.getText().toString();
                    String text_pass	=	edt_pass.getText().toString();
                    Bundle myBundle	=	 new Bundle();
                    myBundle.putString("text_email", text_email);
                    myBundle.putString("text_pass", text_pass);
                    myIntent.putExtra("result", myBundle);
                    startActivity(myIntent);
                }
                catch(Exception ex){

                }
            }
        });
    }
}
