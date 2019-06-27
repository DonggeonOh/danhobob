package com.example.danhobob;

import androidx.appcompat.app.AppCompatActivity;
import io.realm.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);


    }
}
