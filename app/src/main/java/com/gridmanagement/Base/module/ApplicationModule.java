package com.gridmanagement.Base.module;

import android.content.Context;


import com.gridmanagement.App;
import com.gridmanagement.Base.scope.ContextLife;
import com.gridmanagement.Base.scope.PerApp;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }
    @Provides
    @PerApp
    @ContextLife("Application")
    public Context provideApplicationContext(){
        return mApplication.getApplicationContext();
    }
}
