package com.oguzhan.landmark;

import java.io.Serializable;

public class LandMarks implements Serializable {

    String name;
    String country;
    int image;
    public  LandMarks(String name,String country, int image){
        this.name=name;
        this.country=country;
        this.image=image;

    }
}
