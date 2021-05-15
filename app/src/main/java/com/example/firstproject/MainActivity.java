package com.example.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView info;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        info=(TextView) findViewById(R.id.tvinfo);
        Login=(Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {

             @Override
            public void onClick(View v) {
             validate();
            }
        });
    }
    private void validate(){
        if((Name.getText().toString().equals("Admin") )&& (Password.getText().toString().equals("DSC@Sastra"))){
            info.setText("Login Successful");
            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
        }else{
            info.setText("incorrect credentials");

        }
    }
}