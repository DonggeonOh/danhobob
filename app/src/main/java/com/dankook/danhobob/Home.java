package com.dankook.danhobob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onSolo(View v){
        Intent i = new Intent(this,Solo.class);
        startActivity(i);
    }

    public void onFriends(View v){
        Intent i = new Intent(this,Solo.class);
        startActivity(i);
    }
}
