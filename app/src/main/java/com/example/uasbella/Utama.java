package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Utama extends AppCompatActivity implements View.OnClickListener{
    TextView teks;
    private Button btnSkinCare1;
    private Button btnSkinCare2;
    private Button btnSkinCare3;
    private Button btnSkinCare4;
    private Button btnSkinCare5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        teks=(TextView)findViewById (R.id.hello);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/Free Version Angelina.ttf");
        teks.setTypeface(customfont);


        btnSkinCare1 = findViewById(R.id.btn_routine);
        btnSkinCare1.setOnClickListener(this);

        btnSkinCare2 = findViewById(R.id.btn_review);
        btnSkinCare2.setOnClickListener(this);

        btnSkinCare3 = findViewById(R.id.btn_jenis);
        btnSkinCare3.setOnClickListener(this);

        btnSkinCare4 = findViewById(R.id.btn_about);
        btnSkinCare4.setOnClickListener(this);

        btnSkinCare5 = findViewById(R.id.btn_cmt);
        btnSkinCare5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_routine:
                startActivity(new Intent(this, SkinRoutine.class));
                break;

            case R.id.btn_review:
                startActivity(new Intent(this, SkinReview.class));
                break;

            case R.id.btn_jenis:
                startActivity(new Intent(this, JenisSkincare.class));
                break;

            case R.id.btn_about:
                startActivity(new Intent(this, AboutMe.class));
                break;

            case R.id.btn_cmt:
                startActivity(new Intent(this, Comment.class));
                break;
        }
    }
}
