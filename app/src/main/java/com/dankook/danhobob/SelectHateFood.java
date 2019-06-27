package com.dankook.danhobob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectHateFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_hate_food);
    }

    public void onComplete(View v){
        Intent i = new Intent(this,Home_01.class);
        startActivity(i);
    }
}
