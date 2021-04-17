package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Toast;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertToDollarsOnButtonClick(View view) {
        EditText userText = (EditText) (findViewById(R.id.userEditTextView));
        ImageView imageView = (ImageView) (findViewById(R.id.imageViewMoney));

        Log.i("button clicked", "User Entry");

        Toast.makeText(this, userText.getText().toString() + "£ is " + convertPoundsToDollars(Double.parseDouble(userText.getText().toString())) + "$", Toast.LENGTH_LONG).show();

        imageView.setImageResource(R.drawable.money);

    }

    private double convertPoundsToDollars(Double pounds) {
        double dollarInPounds = 1.38;
        return pounds * dollarInPounds;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}