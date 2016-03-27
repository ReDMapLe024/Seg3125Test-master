package com.example.philippe.seg3125test;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;

public class ProfileActivity extends Activity implements View.OnClickListener{

    Button learnButton;
    Button glossaryButton;
    Button profileButton;


    private ProgressBar pbarMath = null;
    private ProgressBar pbarScience = null;
    private ProgressBar pbarEconomics = null;
    private ProgressBar pbarFinance = null;
    private ProgressBar pbarComputers = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        pbarMath = (ProgressBar) findViewById(R.id.pbar_math);
        pbarMath.setMax(100);
        //pbarMath.setScaleY(3f);
        pbarMath.setVisibility(View.VISIBLE);
        //pbarMath.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        pbarMath.setProgressBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        pbarMath.setProgress(66);

        pbarScience = (ProgressBar) findViewById(R.id.pbar_science);
        pbarScience.setMax(100);
        //pbarScience.setScaleY(3f);
        pbarScience.setVisibility(View.VISIBLE);
        pbarScience.setProgressBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        //pbarScience.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        pbarScience.setProgress(40);

        pbarEconomics = (ProgressBar) findViewById(R.id.pbar_economics);
        pbarEconomics.setMax(100);
        //pbarEconomics.setScaleY(3f);
        pbarEconomics.setVisibility(View.VISIBLE);
        pbarEconomics.setProgressBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        //pbarEconomics.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        pbarEconomics.setProgress(20);

        pbarFinance = (ProgressBar) findViewById(R.id.pbar_finance);
        pbarFinance.setMax(100);
        //pbarFinance.setScaleY(3f);
        pbarFinance.setVisibility(View.VISIBLE);
        pbarFinance.setProgressBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        //pbarFinance.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        pbarFinance.setProgress(10);

        pbarComputers = (ProgressBar) findViewById(R.id.pbar_computers);
        pbarComputers.setMax(100);
        //pbarComputers.setScaleY(3f);
        pbarComputers.setVisibility(View.VISIBLE);
        pbarComputers.setProgressBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        //pbarComputers.setProgressTintList(ColorStateList.valueOf(Color.GREEN));
        pbarComputers.setProgress(90);

        learnButton = (Button) findViewById(R.id.button_learn);
        learnButton.setOnClickListener(this);
        glossaryButton = (Button) findViewById(R.id.button_glossary);
        glossaryButton.setOnClickListener(this);
        profileButton = (Button) findViewById(R.id.button_profile);
        profileButton.setTextColor(ColorStateList.valueOf(Color.BLUE)
        );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_learn :
                Intent intentl = new Intent(this, MainActivity.class);
                startActivity(intentl);
                overridePendingTransition(0, 0);
                break;
            case R.id.button_glossary :
                Intent intentg = new Intent(this, GlossaryActivity.class);
                startActivity(intentg);
                overridePendingTransition(0, 0);
                break;
        }
    }
}
