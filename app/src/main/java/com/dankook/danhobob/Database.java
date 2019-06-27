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

        RealmResults<com.dankook.danhobob.FoodData> foods = mRealm.where(com.dankook.danhobob.FoodData.class).findAll();
        Log.d("count", "" + foods.toArray().length);

        com.dankook.danhobob.FoodData food = mRealm.where(com.dankook.danhobob.FoodData.class)
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

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                com.dankook.danhobob.FoodData myfood = mRealm.where(com.dankook.danhobob.FoodData.class)
                        .equalTo("id", key)
                        .findFirst();
                myfood.setPreference(newValue);
            }
        });

        food.getPreference();
        Log.d("새 값", ""+food.getPreference());
    }

//    public static void main(String[] args) {
//        Context mContext = null;
//        test(mContext);
//    }
}


