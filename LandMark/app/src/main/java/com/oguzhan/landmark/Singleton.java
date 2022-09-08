package com.oguzhan.landmark;

import android.graphics.Bitmap;

public class Singleton {

    private Landmarks selectedLandmark;
    private static Singleton singleton;

    private Singleton() {

    }

    public Landmarks getSelectedLandmark() {
        return selectedLandmark;
    }

    public void setChosenLandmark(LandMarks selectedLandmark) {
        this.selectedLandmark = selectedLandmark;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;

    }

}
