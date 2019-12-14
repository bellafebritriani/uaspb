package com.example.uasbella;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class JenisSkincare extends AppCompatActivity {
    ListView listView;
    String mTitle [] = {"Cetaphil Gentle Skincare","Acnes Creamy Wash","Fresh Herb Origin Serum", "Innisfree Green tea Seed Serum", "Biore UV Aqua Rich" ,"Sun Protection Emina","Nacific Real Floral Toner", "Miracle Toner Some By Mi"};
    int image[] = {R.drawable.serum1,R.drawable.serum2,R.drawable.srm1,R.drawable.srm2,R.drawable.sun1,R.drawable.sun2,R.drawable.toner1,R.drawable.toner2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_skincare);

        listView = findViewById(R.id.mylistview);

        MyAdapter adapter = new MyAdapter(this, mTitle, image);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        int rImg[];

        MyAdapter (Context c, String title[], int img[]){

            super(c, R.layout.row, R.id.textview1,title);
            this.context = c;
            this.rTitle = title;
            this.rImg = img;
        }

        @NonNull
        @Override
        public View getView (int position, View convertView, ViewGroup parent){

            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView image = row.findViewById(R.id.imagee);
            TextView myTitle = row.findViewById(R.id.textview1);

            image.setImageResource(rImg[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }
}
