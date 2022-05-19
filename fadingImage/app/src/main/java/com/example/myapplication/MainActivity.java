package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean bartShowing = true;
    boolean rotation = true;
    boolean rotateSize= true;
    public void spin(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

        if(rotation == true){
            bartImage.animate().rotation(180).setDuration(1000);
            homerImage.animate().rotation(180).setDuration(1000);
            rotation = false;
        }else if(rotation == false) {
            bartImage.animate().rotation(0).setDuration(1000);
            homerImage.animate().rotation(0).setDuration(1000);
            rotation = true;
        }

    }

    public void spinSize(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

        bartImage.animate().rotation(180).scaleY(0.5f).setDuration(1000);

        if(rotateSize == true){
            bartImage.animate().rotation(180).scaleY(0.5f).setDuration(1000);
            homerImage.animate().rotation(180).scaleY(0.5f).setDuration(1000);
            rotateSize = false;
        }else if(rotateSize == false) {
            bartImage.animate().rotation(0).scaleY(1f).setDuration(1000);
            homerImage.animate().rotation(0).scaleY(1f).setDuration(1000);
            rotateSize = true;
        }

    }
    public void moveUp(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

        bartImage.animate().translationY(2000).setDuration(2000);
        homerImage.animate().translationY(2000).setDuration(2000);
        Log.i("Log","up clicked");
    }

    public void movedown(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

        bartImage.animate().translationY(-2000).setDuration(2000);
        homerImage.animate().translationY(-2000).setDuration(2000);
        Log.i("Log","down clicked");

    }

    public void resetImage(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

        bartImage.setTranslationY(200);
        homerImage.setTranslationY(200);

    }
    public void onClick(View view){
        ImageView bartImage = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImage = (ImageView) findViewById(R.id.homerImageView);

//        bartImage.animate().alpha(0).setDuration(2000);
//        homerImage.animate().alpha(1).setDuration(2000);

        if(bartShowing == true){
            bartShowing = false;
            bartImage.animate().alpha(0).setDuration(2000);
            homerImage.animate().alpha(1).setDuration(2000);
        }else {
            bartShowing = true;
            homerImage.animate().alpha(0).setDuration(2000);
            bartImage.animate().alpha(1).setDuration(2000);
        }
        Log.i("Log: ", "Bart Clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}