package com.example.aradg.imagetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    Random rnd=new Random();
    int random;
    int pic1;
    int pic2;
    int pic3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView)findViewById(R.id.imgview);
        pic1=R.drawable.ls;
        pic2=R.drawable.download;
        pic3=R.drawable.dog3;

    }

    public void changeimg(View view) {
        random=rnd.nextInt(3);
        if(random==1){
            img.setImageResource(pic1);
        }else if(random==2){
            img.setImageResource(pic2);
        }else img.setImageResource(pic3);
    }
}
