package com.example.wall;

import java.io.IOException;

import android.app.ActionBar;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.core.content.ContextCompat;

import com.android.wallpaperbackgrapp.R;

public class MainActivity extends Activity implements View.OnClickListener {



    private Button   theme5, theme6;
    private Button theme1, theme4, theme3, theme2;
    private WallpaperManager wallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wallpaperManager = WallpaperManager.getInstance(this);

        theme1 = findViewById(R.id.theme1);
        theme1.setOnClickListener(this);

        theme2 = findViewById(R.id.theme2);
        theme2.setOnClickListener(this);

        theme3 = findViewById(R.id.theme3);
        theme3.setOnClickListener(this);

        theme4 = findViewById(R.id.theme4);
        theme4.setOnClickListener(this);

        theme5 = findViewById(R.id.theme5);
        theme5.setOnClickListener(this);

        theme6 = findViewById(R.id.theme6);
        theme6.setOnClickListener(this);



      /*  DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int width = displaymetrics.widthPixels;
        int buttonWidth = width / 2;
        theme1.setWidth(buttonWidth);

       */

    }




    public void onClick(View view) {
        if(view == theme1){
            startActivity(new Intent(this, Theme1.class));
        }

        if(view == theme2){
            startActivity(new Intent(this, Theme2.class));
        }

        if(view == theme3){
            startActivity(new Intent(this, Theme3.class));
        }

        if(view == theme4){
            startActivity(new Intent(this, Theme4.class));
        }
        if(view == theme5){
            startActivity(new Intent(this, Theme5.class));
        }
        if(view == theme6){
            startActivity(new Intent(this, Theme6.class));
        }


    }
}
