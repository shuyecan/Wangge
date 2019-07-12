package com.gridmanagement.Base.component;

import android.app.Activity;
import android.content.Context;

import com.gridmanagement.Base.module.ActivityModule;
import com.gridmanagement.Base.scope.ContextLife;
import com.gridmanagement.Base.scope.PerActivity;
import com.gridmanagement.View.Activity.LoginActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    void inject(LoginActivity loginActivity);

}
