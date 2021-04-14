package com.example.pictureswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonOnClick(View view){
        ImageView image = (ImageView) (findViewById(R.id.imageView));

        Log.i("info", "Button clicked");
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();

        image.setImageResource(R.drawable.eren);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}