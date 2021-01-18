package com.example.DAKPA;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.prefs.Preferences;

public class IntroPref {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;
    int PRIVATE_MODE = 0;
    private static final String PREF_NAMA = "SadariSlider";
    private static final String IS_FIRST_TIME_LAUNCH = "firstTime";

    public IntroPref(Context context){
        this.context = context;
        preferences = context.getSharedPreferences(PREF_NAMA, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setIsFirstTimeLaunch(boolean firstTimeLaunch){
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, firstTimeLaunch);
        editor.commit();
    }

    public boolean isFirstTimeLauch(){
        return preferences.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}
