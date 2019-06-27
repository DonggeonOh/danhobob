package com.dankook.danhobob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Solo extends AppCompatActivity {
    private EditText edt;
    private Button btnFood;
    boolean []arr = {false, false};  //안눌렸음을 false라고 함

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);
    }

    public void onRecommend(View v) {
        R.id.s1
        Intent i = new Intent(this,Recommend.class);
        startActivity(i);
        finish();
    }

    public void onCheck(View v){
        btnFood = (Button)v;
        if(btnFood.getBackground().equals("#ffffff")){
            Log.d("hi", "onCheck: ");
            btnFood.setBackgroundColor(0);
        }
        else{
            Log.d("bye", "onCheck200202: ");
            btnFood.setBackgroundColor(255);
        }
    }
}
