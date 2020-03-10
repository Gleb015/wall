package com.example.wall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.android.wallpaperbackgrapp.R;

public class Theme4 extends AppCompatActivity implements View.OnClickListener{

    private int[] backgrounds;

    private ImageView background1;
    private ImageView background2;
    private ImageView background3;
    private ImageView background4;

    private ImageView background5;
    private ImageView background6;
    private ImageView background7;
    private ImageView background8;
    private ImageView background9;
    private ImageView background10;
    private ImageView background11;
    private ImageView background12;
    private WallpaperManager wallpaperManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme4);

        wallpaperManager = WallpaperManager.getInstance(this);

        background1 = findViewById(R.id.background1);
        background1.setOnClickListener(this);

        background2 = findViewById(R.id.background2);
        background2.setOnClickListener(this);
        background3 = findViewById(R.id.background3);
        background3.setOnClickListener(this);
        background4 = findViewById(R.id.background4);
        background4.setOnClickListener(this);



        background5 = findViewById(R.id.background5);
        background5.setOnClickListener(this);

        background6 = findViewById(R.id.background6);
        background6.setOnClickListener(this);

        background7 = findViewById(R.id.background7);
        background7.setOnClickListener(this);

        background8 = findViewById(R.id.background8);
        background8.setOnClickListener(this);

        background9 = findViewById(R.id.background9);
        background9.setOnClickListener(this);

        background10 = findViewById(R.id.background10);
        background10.setOnClickListener(this);

        background11 = findViewById(R.id.background11);
        background11.setOnClickListener(this);

        background12 = findViewById(R.id.background12);
        background12.setOnClickListener(this);
        loadBackgrounds();
    }

    void loadBackgrounds(){
        backgrounds = new int[12];
        backgrounds[0] = R.drawable.cars1;
        backgrounds[1] = R.drawable.cars2;
        backgrounds[2] = R.drawable.cars3;
        backgrounds[3] = R.drawable.cars4;

        backgrounds[4] = R.drawable.cars6;
        backgrounds[5] = R.drawable.cars7;
        backgrounds[6] = R.drawable.cars8;
        backgrounds[7] = R.drawable.cars9;

        backgrounds[8] = R.drawable.cars10;
        backgrounds[9] = R.drawable.cars11;
        backgrounds[10] = R.drawable.cars12;
        backgrounds[11] = R.drawable.cars13;
    }





    void updateBackground(int background){
        try{
            wallpaperManager.setResource(background);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }


    public void onClick(View view) {
        if(view == background1){
            updateBackground(backgrounds[0]);
            return;

        }

        if(view == background2){
            updateBackground(backgrounds[1]);
            return;
        }

        if(view == background3){
            updateBackground(backgrounds[2]);
            return;
        }

        if(view == background4){
            updateBackground(backgrounds[3]);
            return;
        }
        if(view == background5){
            updateBackground(backgrounds[4]);
            return;
        }

        if(view == background6){
            updateBackground(backgrounds[5]);
            return;
        }

        if(view == background7){
            updateBackground(backgrounds[6]);
            return;
        }

        if(view == background8){
            updateBackground(backgrounds[7]);
            return;
        }
        if(view == background9){
            updateBackground(backgrounds[8]);
            return;
        }

        if(view == background10){
            updateBackground(backgrounds[9]);
            return;
        }

        if(view == background11){
            updateBackground(backgrounds[10]);
            return;
        }

        if(view == background12){
            updateBackground(backgrounds[11]);
            return;
        }
    }
}
