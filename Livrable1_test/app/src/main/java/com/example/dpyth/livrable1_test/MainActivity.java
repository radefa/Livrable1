package com.example.dpyth.livrable1_test;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    GridLayout.LayoutParams lp = new GridLayout.LayoutParams();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       /* GridLayout grd = (GridLayout)findViewById(R.id.GridLayout1);
        grd.setPadding(0, 0, 0, 0);
        grd.setUseDefaultMargins(false);
        grd.setAlignmentMode(GridLayout.ALIGN_MARGINS);*/
    }
    public void fonctionCouleur ()
    {
        GridLayout grd = (GridLayout)findViewById(R.id.GridLayout1);



    }
}
