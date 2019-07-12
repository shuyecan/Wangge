package com.gridmanagement.View.contract;

import com.gridmanagement.Base.BaseContract;

public interface LoginContract {

    interface View extends BaseContract.BaseView {
        void shoowLoginSuccess();
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void Login(String username,String pwd);
    }
}
