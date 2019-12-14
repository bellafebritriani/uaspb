package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class AboutMe extends FragmentActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4;
    FragMySkincare myskincare;
    FragMyProfile myprofile;
    FragSosmed sosmed;
    FragFavorite favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    void mMySkincare(){
        myskincare = new FragMySkincare();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.frag, myskincare);
        ft.commit();
    }
    void mFavorite(){
        favorite = new FragFavorite();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.frag, favorite);
        ft.commit();
    }
    void mProfile(){
        myprofile = new FragMyProfile();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.frag, myprofile);
        ft.commit();
    }
    void mSosmed(){
        sosmed= new FragSosmed();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.frag, sosmed);
        ft.commit();
    }

    @Override
    public void onClick(View v) {
        if (v == btn1){
            mMySkincare();
        }
        if (v == btn2){
            mFavorite();
        }
        if (v == btn3){
            mProfile();
        }
        if (v == btn4){
            mSosmed();
        }
    }
}
