package com.example.uasbella;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.sql.Struct;

public class MainActivity extends AppCompatActivity {
    EditText username, password, show;
    Button btnLogin;
    TextView Bella3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bella3=(TextView)findViewById (R.id.skin);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/White Star free.otf");
        Bella3.setTypeface(customfont);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("bellafebri") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, Utama.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        });
    }
}
