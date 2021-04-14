package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void loginButtonOnClick(View view){
        EditText userNameEditText = (EditText)(findViewById(R.id.editTextTextUserName));
        Log.i("info", "Button Clicked");
        Log.i("UserName", userNameEditText.getText().toString());

        Toast.makeText(this,"Hello "+userNameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}