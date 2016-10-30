package com.example.dpyth.livrable1_test;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img=(ImageView)findViewById(R.id.black_king_st);
        Drawable myDrawable = getResources().getDrawable(R.drawable.black_king_st);
        img.setImageDrawable(myDrawable);

    }
}
