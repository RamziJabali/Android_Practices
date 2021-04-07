package com.example.pleasework;

import androidx.appcompat.app.AppCompatActivity;//importing the framework which allows us to use certain functions
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    public void clickFunction(View view){
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Log.i("info", "Button is pressed");//we're putting a line of code into Log, The log tells us what is going on behind the scenes when the app is running
                                                    //So we're putting a type of log called "i" for info, which tells you that things are going good.
                                                    //we add a tag that describes the log, and we can display that message in the Logcat.
        Log.i("Values" , nameEditText.getText().toString()); //gets the value of the variable nameEditText, then we convert it to a string!

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}