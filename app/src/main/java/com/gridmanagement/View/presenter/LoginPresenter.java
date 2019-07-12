package com.gridmanagement.View.presenter;

import com.blankj.utilcode.util.ToastUtils;
import com.gridmanagement.Base.BasePresenter;
import com.gridmanagement.R;
import com.gridmanagement.View.Activity.LoginActivity;
import com.gridmanagement.View.contract.LoginContract;

import io.reactivex.functions.Consumer;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    @Override
    public void Login(String username, String pwd) {
            mView.showLoading();
        RetrofitManager.create(WanAndroidApi.class).login(account,password)
                .compose(mView.<DataResponse<User>>bindToLife())
                .compose(RxSchedulers.<DataResponse<User>>applySchedulers())
                .subscribe(new Consumer<DataResponse<User>>() {
                    @Override
                    public void accept(DataResponse<User> userDataResponse) throws Exception {
                        if (userDataResponse.getErrorCode()!=0){
                            //表示出错
                            mView.showFaild(userDataResponse.getErrorMsg().toString());
                        }else{
                            mView.shoowLoginSuccess();
                        }

                        mView.hideLoading();

                    }
                }, this::loadError);
    }


    private void loadError(Throwable throwable) {
        throwable.printStackTrace();
        mView.hideLoading();
        ToastUtils.showShort( R.string.load_error);
    }
}
