package com.dankook.danhobob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Solo extends AppCompatActivity {
    private EditText edt;
    private Button btnFood;
    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);
    }

    public void onRecommend(View v) {
        Intent i = new Intent(this,Recommend.class);
        startActivity(i);
        finish();
    }

    public void onCheck(View v){

    }
}
