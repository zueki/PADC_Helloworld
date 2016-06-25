package com.myapplication.padc_layout;

import android.app.Application;
import android.content.Context;

/**
 * Created by Su Su Oo on 6/18/2016.
 */
public class PADC_layout_app extends Application {


    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this.getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
