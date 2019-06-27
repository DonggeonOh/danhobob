package com.dankook.danhobob;

import android.content.Context;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class Database<let> {

    private static Realm mRealm;

    public void test(Context context) {
        mRealm = Realm.getDefaultInstance();



    }

    public static void UpdatePreference(final int key, final int newValue) {
        mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();

        //com.example.myapplication.Food food = new com.example.myapplication.Food();

        RealmResults<FoodData5> foods = mRealm.where(FoodData5.class).findAll();
        Log.d("count", "" + foods.toArray().length);

        FoodData5 food = mRealm.where(FoodData5.class)
                .equalTo("id", key)
                .findFirst();

        Log.d("키", ""+key);
        Log.d("newval", ""+newValue);
        Log.d("food", ""+food);
        if (food == null) {
            Log.d("null", "");
        }
        food.setPreference(newValue);

        mRealm.commitTransaction();

        food.getPreference();

        Log.d("새 값", ""+food.getPreference());
    }

//    public static void main(String[] args) {
//        Context mContext = null;
//        test(mContext);
//    }
}


