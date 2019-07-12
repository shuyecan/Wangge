package com.gridmanagement.View.Activity;

import com.gridmanagement.R;
import com.gridmanagement.View.contract.LoginContract;
import com.gridmanagement.View.presenter.LoginPresenter;
import com.gridmanagement.Base.BaseActivity;


public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View{

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public void shoowLoginSuccess() {

    }
}
