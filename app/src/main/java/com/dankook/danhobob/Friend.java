package com.dankook.danhobob;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Friend extends AppCompatActivity {
    private EditText edt;
    private Button btnFood;
    // 매움,
    boolean arr = false;  //안눌렸음을 false라고 함

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

    public void onSearch(View v){
        // editText의 id 받아옴
        EditText eT = (EditText)findViewById(R.id.hateText);

        // editText의 입력받은 내용을 얻어옴
        String str = eT.getText().toString();

        if(str.length() == 0){
            //공백일 때 처리
        }else{
            //공백이 아닐 때 처리
        }
    }

    public void onCheck(View v){
        String str=null;
        btnFood = (Button)v;
        switch(v.getId()){
            case R.id.s3: //느끼한것
                if(arr == false){ arr=true; btnFood.setBackgroundColor(Color.rgb(70, 70, 70));}
                else { btnFood.setBackgroundColor(Color.rgb(255, 255, 255));}
                break;
        }
    }
}
