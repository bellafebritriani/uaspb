package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkinReview extends AppCompatActivity implements View.OnClickListener{
    TextView bella2;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_review);

        bella2=(TextView)findViewById (R.id.hello);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/Gravity Handwritten.ttf");
        bella2.setTypeface(customfont);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                finish();
        }
    }
}
