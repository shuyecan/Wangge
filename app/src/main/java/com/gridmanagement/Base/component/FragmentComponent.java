package com.gridmanagement.Base.component;

import android.app.Activity;
import android.content.Context;

import com.gridmanagement.Base.module.FragmentModule;
import com.gridmanagement.Base.scope.ContextLife;
import com.gridmanagement.Base.scope.PerFragment;


import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getAcitivtyContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getAcitivty();

    //void inject(ZhihuFragment zhihuFragment);
}
