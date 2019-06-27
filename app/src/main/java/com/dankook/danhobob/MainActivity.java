package com.dankook.danhobob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button noneLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, com.dankook.danhobob.SplashActivity.class));

        noneLoginBtn = findViewById(R.id.bt_none_login);
        noneLoginBtn.setOnClickListener(this);

        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .schemaVersion(0)
                .modules(new MyRealmModule())
                .migration(new Migration())
                .build();
        Realm.setDefaultConfiguration(configuration);
        ImportData.Import();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_none_login:
                Intent intent = new Intent(this, RatingActivity.class);
                startActivity(intent);
                finish();
                default:

        }
    }
}
