package com.dankook.danhobob;

import android.content.Context;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class DataCenter {

    private Realm mRealm;

    public void test(Context context) {

        Realm.init(context);
        mRealm = Realm.getDefaultInstance();

        saveFood();
        loadFood();
    }

    private void saveFood() {
        mRealm.beginTransaction();

        Food food = mRealm.createObject(Food.class);
        food.setName("치킨");
        mRealm.commitTransaction();
    }

    private void loadFood() {
        RealmResults foods = mRealm.where(Food.class).findAll();
    }
}
