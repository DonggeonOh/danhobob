package com.dankook.danhobob;

import io.realm.Realm;

public class ImportData {
    public static void Import() {
        Realm realm = Realm.getDefaultInstance();

        FoodData food = realm.where(FoodData.class)
                .findFirst();

        if (food != null){
            return;
        }

        realm.beginTransaction();




        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(0);
            foodData.setName("호박죽");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("부드러운");
            foodData.setFlavor("달콤");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("추움");
            foodData.setAllergic(null);
            foodData.setIngredient("쌀");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(1);
            foodData.setName("오므라이스");
            foodData.setPreference(3);
            foodData.setCategory("양식");
            foodData.setTexture("null");
            foodData.setFlavor("null");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("계란");
            foodData.setIngredient("쌀");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(2);
            foodData.setName("초밥");
            foodData.setPreference(3);
            foodData.setCategory("일식");
            foodData.setTexture("차가운");
            foodData.setFlavor("null");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic("생선");
            foodData.setIngredient("해산물");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(3);
            foodData.setName("간장치킨");
            foodData.setPreference(3);
            foodData.setCategory("기타");
            foodData.setTexture("null");
            foodData.setFlavor("달콤");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("닭");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(4);
            foodData.setName("야채곱창");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("null");
            foodData.setFlavor("매콤");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("고기");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(5);
            foodData.setName("햄버거");
            foodData.setPreference(3);
            foodData.setCategory("양식");
            foodData.setTexture("식감있는");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("고기");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(6);
            foodData.setName("양념치킨");
            foodData.setPreference(3);
            foodData.setCategory("기타");
            foodData.setTexture("바삭한");
            foodData.setFlavor("매콤");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("닭");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(7);
            foodData.setName("삼겹살");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("식감있는");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("돼지");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(8);
            foodData.setName("라면");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("부드러운");
            foodData.setFlavor("매콤");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("추움");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(9);
            foodData.setName("짜장면");
            foodData.setPreference(3);
            foodData.setCategory("중식");
            foodData.setTexture("null");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(10);
            foodData.setName("샤브샤브");
            foodData.setPreference(3);
            foodData.setCategory("일식");
            foodData.setTexture("식감있는");
            foodData.setFlavor("null");
            foodData.setWeather("비");
            foodData.setTime(0);
            foodData.setTemperature("추움");
            foodData.setAllergic(null);
            foodData.setIngredient("고기");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(11);
            foodData.setName("마라탕");
            foodData.setPreference(3);
            foodData.setCategory("중식");
            foodData.setTexture("null");
            foodData.setFlavor("매콤");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("추움");
            foodData.setAllergic("땅콩");
            foodData.setIngredient("null");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(12);
            foodData.setName("후라이드치킨");
            foodData.setPreference(3);
            foodData.setCategory("기타");
            foodData.setTexture("바삭한");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("닭");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(13);
            foodData.setName("냉면");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("차가운");
            foodData.setFlavor("null");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("더움");
            foodData.setAllergic(null);
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(14);
            foodData.setName("떡볶이");
            foodData.setPreference(3);
            foodData.setCategory("분식");
            foodData.setTexture("쫀득한");
            foodData.setFlavor("매콤");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("null");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(15);
            foodData.setName("일본라멘");
            foodData.setPreference(3);
            foodData.setCategory("일식");
            foodData.setTexture("부드러운");
            foodData.setFlavor("느끼");
            foodData.setWeather("비");
            foodData.setTime(0);
            foodData.setTemperature("추움");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(16);
            foodData.setName("샐러드");
            foodData.setPreference(3);
            foodData.setCategory("기타");
            foodData.setTexture("차가운");
            foodData.setFlavor("null");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("더움");
            foodData.setAllergic(null);
            foodData.setIngredient("야채");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(17);
            foodData.setName("멸치국수");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("부드러운");
            foodData.setFlavor("null");
            foodData.setWeather("비");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(18);
            foodData.setName("팟타이");
            foodData.setPreference(3);
            foodData.setCategory("동남아");
            foodData.setTexture("식감있는");
            foodData.setFlavor("null");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("면");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(19);
            foodData.setName("푸팟퐁커리");
            foodData.setPreference(3);
            foodData.setCategory("동남아");
            foodData.setTexture("null");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("게");
            foodData.setIngredient("해산물");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(20);
            foodData.setName("얇은 피자");
            foodData.setPreference(3);
            foodData.setCategory("양식");
            foodData.setTexture("null");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("null");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(21);
            foodData.setName("오꼬노미야끼");
            foodData.setPreference(3);
            foodData.setCategory("일식");
            foodData.setTexture("부드러운");
            foodData.setFlavor("느끼");
            foodData.setWeather("비");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("null");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(22);
            foodData.setName("빈대떡");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("식감있는");
            foodData.setFlavor("느끼");
            foodData.setWeather("비");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("밀가루");
            foodData.setIngredient("null");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(23);
            foodData.setName("곱창");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("쫀득한");
            foodData.setFlavor("느끼");
            foodData.setWeather("맑음");
            foodData.setTime(1);
            foodData.setTemperature("적당");
            foodData.setAllergic(null);
            foodData.setIngredient("고기");
        }

        {
            FoodData foodData = realm.createObject(FoodData.class);

            foodData.setId(24);
            foodData.setName("간장게장");
            foodData.setPreference(3);
            foodData.setCategory("한식");
            foodData.setTexture("부드러운");
            foodData.setFlavor(null);
            foodData.setWeather("맑음");
            foodData.setTime(0);
            foodData.setTemperature("적당");
            foodData.setAllergic("게");
            foodData.setIngredient("해산물");
        }

        realm.commitTransaction();
    }
}
