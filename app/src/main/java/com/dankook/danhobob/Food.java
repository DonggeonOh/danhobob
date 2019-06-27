package com.dankook.danhobob;
import io.realm.*;

public class Food extends RealmObject{
    private String name;
    private String category;    //음식 종류
    private String testure;     //식감
    private String flavor;      //맛
    private boolean weather;    //날씨
    private String time;        //시간
    private String temperature; //기온


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTesture() {
        return testure;
    }

    public void setTesture(String testure) {
        this.testure = testure;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean isWeather() {
        return weather;
    }

    public void setWeather(boolean weather) {
        this.weather = weather;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
} //food class




