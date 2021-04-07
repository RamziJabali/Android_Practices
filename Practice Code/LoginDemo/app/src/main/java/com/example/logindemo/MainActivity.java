package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void loginButtonOnClick(View view){
        EditText userNameEditText = (EditText)(findViewById(R.id.editTextTextUserName));
        EditText passwordEditText = (EditText)(findViewById(R.id.editTextPassword));

        Log.i("info", "Button Clicked");

        Log.i("UserName", userNameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}