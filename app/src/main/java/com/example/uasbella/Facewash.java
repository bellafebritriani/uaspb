package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Facewash extends AppCompatActivity {
    private TextView Face1, Face2, Face3, Face4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facewash);
        getSupportActionBar().setTitle("Face Wash");

        Face1 = findViewById(R.id.face1);
        Face2 = findViewById(R.id.face2);
        Face3 = findViewById(R.id.face3);
        Face4 = findViewById(R.id.face4);
        showData();
    }

    private void showData(){
        String nama = getIntent().getExtras().getString("FaceWash");

        switch (nama){
            case "Face Wash":
                break;
        }
    }
}
