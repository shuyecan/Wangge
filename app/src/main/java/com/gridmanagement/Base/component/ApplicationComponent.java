package com.gridmanagement.Base.component;

import android.content.Context;

import com.gridmanagement.Base.module.ApplicationModule;
import com.gridmanagement.Base.scope.ContextLife;
import com.gridmanagement.Base.scope.PerApp;


import dagger.Component;

@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}