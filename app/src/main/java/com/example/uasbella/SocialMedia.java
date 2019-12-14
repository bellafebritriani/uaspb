package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialMedia extends AppCompatActivity implements View.OnClickListener{
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

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
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                finish();
        }
    }
}
