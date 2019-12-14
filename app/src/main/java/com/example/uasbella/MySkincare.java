package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MySkincare extends AppCompatActivity implements View.OnClickListener{
    private Button btn_back;
    TextView bella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_skincare);

        bella=(TextView)findViewById (R.id.routine);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/White Star free.otf");
        bella.setTypeface(customfont);

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
