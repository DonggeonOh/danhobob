package com.dankook.danhobob;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    private Button soloBtn;
    private Button friendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        soloBtn = findViewById(R.id.bt_solo);
        friendBtn = findViewById(R.id.bt_friend);
        

        Intent intent = getIntent();
        float[] fl = intent.getExtras().getFloatArray("rating");
    }

    public void onSolo() {
        Intent i = new Intent(this, SoloActivity.class);
        startActivity(i);
    }

    public void onFriends(){
        Intent i = new Intent(this, SoloActivity.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_solo:
                onSolo();
                break;
            case R.id.bt_friend:
                onFriends();
        }
    }
}
