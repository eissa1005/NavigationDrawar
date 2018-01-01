package com.example.eissa.navigationdrawar.MainPresenter;

import android.app.Application;
import android.content.Context;

/**
 * Created by EISSA on 30/12/2017.
 */

public class AppContext extends Application{

    public static Context appContext;

    public static AppContext get(Context context){
        return  (AppContext)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext =getApplicationContext();
    }

    public static Context getContext(){
        return  appContext;
    }
}
